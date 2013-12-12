package me.loogeh.Hype;

import java.util.HashMap;

import org.bukkit.Material;

public class BetterItem {
	public static Hype plugin;
	
	private String raw = "";
	private String name = "";
	private String customName = "";
	private int id;
	private short data;
	
	public static HashMap<Material, BetterItem> itemMap = new HashMap<Material, BetterItem>();
	
	public BetterItem(String raw, String name, String customName, int id) {
		this.raw = raw;
		this.name = name;
		this.customName = customName;
		this.id = id;
	}
	
	public BetterItem(String raw, String name, String customName, int id, short data) {
		this.raw = raw;
		this.name = name;
		this.customName = customName;
		this.id = id;
		this.data = data;
	}
	
	public String getRaw(Material mat) {
		if(mat == null) {
			return null;
		}
		return this.raw;
		
	}
	
	public String getName(Material mat) {
		if(mat == null) {
			return null;
		}
		return this.name;
	}
	
	public String getCustomName(Material mat) {
		if(mat == null) {
			return null;
		}
		return this.customName;
	}
	
	public int getID() {
		return this.id;
	}
	
	public short getData() {
		return this.data;
	}
	
//	public static String searchItem(Material mat) {
//		if(!itemMap.containsKey(mat)) {
//			return "Item doesn't exist";
//		}
//		
//		
//	}
	
	public static String searchForMaterial(String name) {
		return "";
		
	}
	
	public static void populateMap() {
		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
		itemMap.put(Material.STONE, new BetterItem("stone", "stone", "Stone", 1));
		itemMap.put(Material.GRASS, new BetterItem("grass", "grass", "Grass", 2));
		itemMap.put(Material.DIRT, new BetterItem("dirt", "dirt", "Dirt", 3));
		itemMap.put(Material.COBBLESTONE, new BetterItem("cobblestone", "cobblestone", "Cobble", 4));
		itemMap.put(Material.WOOD, new BetterItem("wood", "oak", "Oak Wood", 5));
		itemMap.put(Material.WOOD, new BetterItem("woodspruce", "spruce", "Spruce Wood", 5, (short) 1));
		itemMap.put(Material.WOOD, new BetterItem("woodbirch", "spruce", "Birch Wood", 5, (short) 2));
		itemMap.put(Material.WOOD, new BetterItem("woodjungle", "spruce", "Jungle Wood", 5, (short) 3));
		itemMap.put(Material.SAPLING, new BetterItem("sapling", "saplingoak", "Oak Sapling", 6));
		itemMap.put(Material.WOOD, new BetterItem("saplingspruce", "sprucesapling", "Spruce Sapling", 6, (short) 1));
		itemMap.put(Material.WOOD, new BetterItem("saplingbirch", "birchsapling", "Birch Sapling", 6, (short) 2));
		itemMap.put(Material.WOOD, new BetterItem("saplingjungle", "junglesapling", "Jungle Sapling", 6, (short) 3));
		itemMap.put(Material.WOOD, new BetterItem("bedrock", "bedrock", "Bedrock", 7));
		itemMap.put(Material.WATER, new BetterItem("water", "water", "Water", 8));
		itemMap.put(Material.LAVA, new BetterItem("lava", "lava", "Lava", 10));
		itemMap.put(Material.SAND, new BetterItem("sand", "sand", "Sand", 12));
		itemMap.put(Material.GRAVEL, new BetterItem("gravel", "gravel", "Gravel", 13));
		itemMap.put(Material.GOLD_ORE, new BetterItem("gold_ore", "goldore", "Gold Ore", 14));
		itemMap.put(Material.IRON_ORE, new BetterItem("iron_ore", "ironore", "Iron Ore", 15));
		itemMap.put(Material.COAL_ORE, new BetterItem("coal_ore", "coalore", "Coal Ore", 16));
		itemMap.put(Material.LOG, new BetterItem("log", "oaklog", "Oak Log", 17));
		itemMap.put(Material.LOG, new BetterItem("logspruce", "sprucelog", "Spruce Log", 17, (short) 1));
		itemMap.put(Material.LOG, new BetterItem("logbirch", "birchlog", "Birch Log", 17, (short) 2));
		itemMap.put(Material.LOG, new BetterItem("logjungle", "junglelog", "Jungle Log", 17, (short) 3));
		itemMap.put(Material.LEAVES, new BetterItem("leaves", "leaf", "Oak Leaves", 18));
		itemMap.put(Material.LEAVES, new BetterItem("leavesspruce", "spruceleaves", "Spruce Leaves", 18, (short) 1));
		itemMap.put(Material.LEAVES, new BetterItem("leavesbirch", "birchleaves", "Birch Leaves", 18, (short) 2));
		itemMap.put(Material.LEAVES, new BetterItem("leavesjungle", "jungleleaves", "Jungle Leaves", 18, (short) 3));
		itemMap.put(Material.SPONGE, new BetterItem("sponge", "sponge", "Sponge", 19));
		itemMap.put(Material.GLASS, new BetterItem("glass", "glass", "Glass", 20));
		itemMap.put(Material.LAPIS_ORE, new BetterItem("lapis_ore", "lapisore", "Lapis Ore", 21));
		itemMap.put(Material.LAPIS_BLOCK, new BetterItem("lapis_block", "lapisblock", "Lapis Block", 22));
		itemMap.put(Material.DISPENSER, new BetterItem("dispenser", "dispenser", "Dispenser", 23));
		itemMap.put(Material.SANDSTONE, new BetterItem("sandstone", "standstone", "Sandstone", 24));
		itemMap.put(Material.SANDSTONE, new BetterItem("sandstonechiseled", "chiseledsandstone", "Chiseled Sandstone", 24, (short) 1));
		itemMap.put(Material.SANDSTONE, new BetterItem("smoothchiseled", "smoothsandstone", "Smooth Sandstone", 24, (short) 2));
		itemMap.put(Material.NOTE_BLOCK, new BetterItem("note_block", "noteblock", "Note Block", 25));
		itemMap.put(Material.BED_BLOCK, new BetterItem("bed_block", "bedblock", "Bed Block", 26));
		itemMap.put(Material.RAILS, new BetterItem("powered_rail", "poweredrail", "Powered Rail", 27));
		itemMap.put(Material.RAILS, new BetterItem("detector_rail", "detectorrail", "Detector Rail", 28));
		itemMap.put(Material.PISTON_STICKY_BASE, new BetterItem("sticky_piston", "stickypiston", "Sticky Piston", 29));
		itemMap.put(Material.WEB, new BetterItem("web", "webgrenade", "Web", 30));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
//		itemMap.put(Material.AIR, new BetterItem("air", "air", "Fists", 0));
		
	}
}