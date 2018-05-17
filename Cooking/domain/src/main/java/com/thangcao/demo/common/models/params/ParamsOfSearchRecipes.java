package com.thangcao.demo.common.models.params;


public class ParamsOfSearchRecipes {

    private String category;
    private String keyword;
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
