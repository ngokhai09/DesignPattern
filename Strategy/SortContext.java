package DesignPattern.Strategy;

public class SortContext {
    private Sort sort;

    public SortContext(Sort sort) {
        this.sort = sort;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public void printSort(){
        this.sort.execute();
    }
}
