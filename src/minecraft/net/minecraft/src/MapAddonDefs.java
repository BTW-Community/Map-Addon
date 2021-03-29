package net.minecraft.src;

public class MapAddonDefs {
	
	public static final boolean DEBUG_ADDON_LOAD = false;
	
	
    
	public static void colorPaletts()
	{
		// set the following to 0 to use default map color palette
		// set to 1 for sepia map color palette
		// set to 2 for light map color palette
		// set to 3 for dark map color palette
		int colorPalette = MapAddon.mapAddonPaletteConf;
		
		//define colors here
		
		if (colorPalette == 1) //sepia colors
	    {
			MapColor.grassColor = new MapColor(1, 11506271);
			MapColor.sandColor = new MapColor(2, 16703931);
			MapColor.clothColor = new MapColor(3, 12755067);
			MapColor.tntColor = new MapColor(4, 8076568);
			MapColor.iceColor = new MapColor(5, 13543821);
			MapColor.ironColor = new MapColor(6, 12755067);
			MapColor.foliageColor = new MapColor(7, 6178837);
		    MapColor.snowColor = new MapColor(8, 16777215);
		    MapColor.clayColor = new MapColor(9, 12360567);
		    MapColor.dirtColor = new MapColor(10, 10318406);
		    MapColor.stoneColor = new MapColor(11, 9073242);
		    MapColor.waterColor = new MapColor(12, 7228218);
		    MapColor.woodColor = new MapColor(13, 7556902);
	    }
		else if (colorPalette == 2) //desaturated colors
	    {
			MapColor.grassColor = new MapColor(1, 9607307);
			MapColor.sandColor = new MapColor(2, 15197918);
			MapColor.clothColor = new MapColor(3, 10987431);
			MapColor.tntColor = new MapColor(4, 6243396);
			MapColor.iceColor = new MapColor(5, 11053235);
			MapColor.ironColor = new MapColor(6, 10987431);
			MapColor.foliageColor = new MapColor(7, 4280129);
		    MapColor.snowColor = new MapColor(8, 16777215);
		    MapColor.clayColor = new MapColor(9, 10987690);
		    MapColor.dirtColor = new MapColor(10, 8484978);
		    MapColor.stoneColor = new MapColor(11, 7368816);
		    MapColor.waterColor = new MapColor(12, 5395047);
		    MapColor.woodColor = new MapColor(13, 5723217);
	    }
		else if (colorPalette == 3) //happy colors
	    {
			MapColor.grassColor = new MapColor(1, 9229842);
			MapColor.sandColor = new MapColor(2, 16771525);
			MapColor.clothColor = new MapColor(3, 10987431);
			MapColor.tntColor = new MapColor(4, 12461619);
			MapColor.iceColor = new MapColor(5, 10526975);
			MapColor.ironColor = new MapColor(6, 10987431);
			MapColor.foliageColor = new MapColor(7, 4491546);
		    MapColor.snowColor = new MapColor(8, 16777215);
		    MapColor.clayColor = new MapColor(9, 11512505);
		    MapColor.dirtColor = new MapColor(10, 14450447);
		    MapColor.stoneColor = new MapColor(11, 8092539);
		    MapColor.waterColor = new MapColor(12, 1997285);
		    MapColor.woodColor = new MapColor(13, 7954203);
	    }
		else //default colors
		{
			MapColor.grassColor = new MapColor(1, 8368696);
			MapColor.sandColor = new MapColor(2, 16247203);
			MapColor.clothColor = new MapColor(3, 10987431);
			MapColor.tntColor = new MapColor(4, 16711680);
			MapColor.iceColor = new MapColor(5, 10526975);
			MapColor.ironColor = new MapColor(6, 10987431);
			MapColor.foliageColor = new MapColor(7, 31744);
		    MapColor.snowColor = new MapColor(8, 16777215);
		    MapColor.clayColor = new MapColor(9, 10791096);
		    MapColor.dirtColor = new MapColor(10, 12020271);
		    MapColor.stoneColor = new MapColor(11, 7368816);
		    MapColor.waterColor = new MapColor(12, 4210943);
		    MapColor.woodColor = new MapColor(13, 6837042);
	    }
	}
	    
	//definitions
	//public static void addDefinitions() {
    //    return;
	//}
	
	/** old sepia
	 * MapColor grassColor = new MapColor(1, 12292167);
			MapColor sandColor = new MapColor(2, 16704185);
			MapColor clothColor = new MapColor(3, 10987431);
			MapColor tntColor = new MapColor(4, 9189888);
			MapColor iceColor = new MapColor(5, 13214081);
			MapColor ironColor = new MapColor(6, 10987431);
			MapColor foliageColor = new MapColor(7, 6899456);
		    MapColor snowColor = new MapColor(8, 16777215);
		    MapColor clayColor = new MapColor(9, 11446176);
		    MapColor dirtColor = new MapColor(10, 11562536);
		    MapColor stoneColor = new MapColor(11, 7368816);
		    MapColor waterColor = new MapColor(12, 8866560);
		    MapColor woodColor = new MapColor(13, 6837042);
		 
	 */
	
} 