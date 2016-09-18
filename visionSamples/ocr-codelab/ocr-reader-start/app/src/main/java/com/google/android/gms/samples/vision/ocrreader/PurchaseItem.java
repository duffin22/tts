package com.google.android.gms.samples.vision.ocrreader;

/**
 * Created by matthewtduffin on 18/09/16.
 */
public class PurchaseItem {
  private String name;
  private int pounds, pennies;

  public PurchaseItem(String name, int pounds, int pennies) {
    this.name = name;
    this.pounds = pounds;
    this.pennies = pennies;
  }

  public String getPrice() {
    return ""+this.pounds+"."+this.pennies;
  }

}
