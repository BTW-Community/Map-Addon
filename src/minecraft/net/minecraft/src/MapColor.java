package net.minecraft.src;

public class MapColor
{

    static {
        MapAddon.getInstance();
    }
    /**
     * Holds all the 16 colors used on maps, very similar of a pallete system.
     */
 
    public static MapColor[] mapColorArray = new MapColor[16];

    /** The map color for Air blocks */
    public static  MapColor airColor = new MapColor(0, 0);

    /** this is the grass color in html format */
    public static MapColor grassColor = new MapColor(1, 8368696);

    /** This is the color of the sand */
    public static MapColor sandColor = new MapColor(2, 16247203);

    /** The map color for Cloth and Sponge blocks */
    public static MapColor clothColor = new MapColor(3, 10987431);

    /** The map color for TNT blocks */
    public static MapColor tntColor = new MapColor(4, 16711680);

    /** The map color for Ice blocks */
    public static MapColor iceColor = new MapColor(5, 10526975);

    /** The map color for Iron blocks */
    public static MapColor ironColor = new MapColor(6, 10987431);

    /** The map color for Leaf, Plant, Cactus, and Pumpkin blocks. */
    public static MapColor foliageColor = new MapColor(7, 31744);

    /** The map color for Snow Cover and Snow blocks */
    public static MapColor snowColor = new MapColor(8, 16777215);

    /** The map color for Clay blocks */
    public static MapColor clayColor = new MapColor(9, 10791096);

    /** The map color for Dirt blocks */
    public static MapColor dirtColor = new MapColor(10, 12020271);

    /** The map color for Stone blocks */
    public static MapColor stoneColor = new MapColor(11, 7368816);

    /** The map color for Water blocks */
    public static MapColor waterColor = new MapColor(12, 4210943);

    /** The map color for Wood blocks */
    public static MapColor woodColor = new MapColor(13, 6837042);

    /** Holds the color in RGB value that will be rendered on maps. */
    public final int colorValue;

    /** Holds the index of the color used on map. */
    public final int colorIndex;

    public MapColor(int par1, int par2)
    {
        this.colorIndex = par1;
        this.colorValue = par2;
        mapColorArray[par1] = this;
    }
    
}
