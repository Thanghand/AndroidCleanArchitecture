package com.thangcao.cooking.common.models.params;


public class ParamsOfFilterRecipes {

    private String category;
    private LoadState loadState;

    public LoadState getLoadState() {
        return loadState;
    }

    public void setLoadState(LoadState loadState) {
        this.loadState = loadState;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
