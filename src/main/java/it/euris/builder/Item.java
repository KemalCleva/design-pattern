package it.euris.builder;

public class Item {

  private int id;
  private double cost;
  private String name;
  private String description;

  public static class ItemBuilder {

    private final Item item;

    public ItemBuilder() {
      this.item = new Item();
    }

    public ItemBuilder setId(int id) {
      this.item.id = id;
      return this;
    }

    public Item build() {
      return this.item;
    }

  }

}
