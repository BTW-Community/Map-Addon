package net.minecraft.src;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.Minecraft;

/**
 * @author Sockthing (@socklessthing)
 *
 */
public class MapAddon extends AddonExt {
	private static MapAddon instance;
	
	public static int mapAddonPaletteConf = 0;
	private static final Map m_configurationMap = new HashMap();

	public MapAddon() {
		super("MapAddon", "1.0.0", "MapAddon");
	}

	public static MapAddon getInstance() {
		if (instance == null) {
			instance = new MapAddon();
		}

		return instance;
	}

	@Override
	public void Initialize() {
		FCAddOnHandler.LogMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
		ReadAddonConfigFile();
		MapAddonDefs.colorPaletts();
		//MapAddonDefs.addDefinitions();
		FCAddOnHandler.LogMessage(this.getName() + " Initialized");
	}
	
	public String GetLanguageFilePrefix()
	{
		return "AchievementsAddon";
	}

	private static void ReadAddonConfigFile()
    {
        File fileDir = new File(Minecraft.getMinecraftDir(), "MapAddonConfig.txt");

        try
        {
            if (!fileDir.exists())
            {
                FCAddOnHandler.LogMessage("MapAddon config file not found...");
                return;
            }

            FCAddOnHandler.LogMessage("MapAddon reading config file...");
            BufferedReader var1 = new BufferedReader(new FileReader(fileDir));
            String var2 = "";

            while ((var2 = var1.readLine()) != null)
            {
            	//FCAddOnHandler.LogMessage("Conf: " + var2);
            	
            	String[] var3 = var2.split("=");

                if (var3.length == 2)
                {
                    for (int var4 = 0; var4 < var3.length; ++var4)
                    {
                        var3[var4] = var3[var4].trim();
                    }

                    m_configurationMap.put(var3[0], var3[1]);

                }
                //FCAddOnHandler.LogMessage("config... "+ m_configurationMap);
            }
            
            var1.close();
        }
        catch (Exception var5)
        {
            System.out.println("Failed to load MapAddon config file");
            var5.printStackTrace();
        }
        
        mapAddonPaletteConf = ParseIntegerConfigSetting("mapAddonPaletteConf", mapAddonPaletteConf);
        
    }
	
	private static int ParseIntegerConfigSetting(String var0, int var1)
    {
        String var2 = (String)m_configurationMap.get(var0);
        
        
        if (var2 != null)
        {
			try
            {
                int var3 = Integer.parseInt(var2);
                if (var3 == 0)
                {
                	System.out.println("MapAddon Config: " + var3 + " (Default colors)");
                }
                else if (var3 == 1)
                {
                	System.out.println("MapAddon Config: " + var3 + " (Sepia colors)");
                }
                else if (var3 == 2)
                {
                	System.out.println("MapAddon Config: " + var3 + " (Light colors)");
                }
                else if (var3 == 3)
                {
                	System.out.println("MapAddon Config: " + var3 + " (Dark colors)");
                }
                else
                {
                	System.out.println("MapAddon Config: " + var3 + " is not defined. Using Default Colors.");
                }
                return var3;
            }
            catch (Exception var4)
            {
                System.out.println("Invalid MapAddon config file entry: " + var0 + " , " + var2);
                var4.printStackTrace();
            }
            
            
            
        }
        

        return var1;
    }

} 