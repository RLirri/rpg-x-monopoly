package core;

// Items only upgrade player stats for now
public class Item {
	public String Name;
	public int Cost;

	public final int HealBonus; // Does not immediately add to health. Instead is added when item is used in battle
	public final int StrengthBonus;
	public final int DefenseBonus;
	public final int AgilityBonus;

	public Item(String name, int cost, int healBonus, int strengthBonus, int defenseBonus, int agilityBonus) {
		Cost = cost;
		Name = name;
		HealBonus = healBonus;
		StrengthBonus = strengthBonus;
		DefenseBonus = defenseBonus;
		AgilityBonus = agilityBonus;
	}
}
