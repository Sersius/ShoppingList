package info.pauek.shoppinglist;

public class ShoppingItem {
    private String name;
    private boolean checkBox;

    public ShoppingItem(String name, boolean checkBox)
    {
        this.name = name;
        this.checkBox = checkBox;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isChecked()
    {
        return checkBox;
    }

    public void setChecked(boolean checkBox)
    {
        this.checkBox = checkBox;
    }

    public void CheckedToggle()
    {
        this.checkBox = !checkBox;
    }
}
