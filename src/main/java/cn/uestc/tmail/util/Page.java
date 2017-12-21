package cn.uestc.tmail.util;

/**
 * 用于分页管理，包含的属性：
 * currentLocation：当前数据的位置
 * eachPageDataNumber：每页显示的数据个数
 * totalDataNumber：总共的数据数量
 * defaultPageDataNumber：默认每页显示的数量
 */
public class Page {
    private int currentLocation;
    private int eachPageDataNumber;
    private int totalDataNumber;
    private String param;//暂时不使用

    private static final int defaultPageDataNumber = 5;

    public Page() {
        this.eachPageDataNumber = defaultPageDataNumber;
    }

    public Page(int currentLocation, int eachPageDataNumber) {
        this.currentLocation = currentLocation;
        this.eachPageDataNumber = eachPageDataNumber;
    }

    /**
     * 获取总页码数量
     * @return 页码总数
     */
    public int getTotalPage() {
        int totalPage;
        if (0 == totalDataNumber % eachPageDataNumber) {
            totalPage = totalDataNumber / eachPageDataNumber;
        } else {
            totalPage = totalDataNumber / eachPageDataNumber + 1;
        }
        if (0 == totalPage) {
            totalPage = 1;
        }
        return totalPage;
    }

    /**
     * 获得最后一页的数据是从哪一条开始的
     * @return 最后一页的第一条数据
     */
    public int getLastPageDataNumber() {
        int lastPageDataNumber;
        if (0 == totalDataNumber % eachPageDataNumber) {
            lastPageDataNumber = totalDataNumber - eachPageDataNumber;
        } else {
            lastPageDataNumber = totalDataNumber - totalDataNumber % eachPageDataNumber;
        }
        lastPageDataNumber = lastPageDataNumber < 0 ? 0 : lastPageDataNumber;
        return lastPageDataNumber;
    }

    /**
     * 判断是否还有前一页
     * @return
     */
    public boolean getHasPrevious() {
        if (currentLocation == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 判断是否还有后一页
     * @return
     */
    public boolean getHasNext() {
        if (currentLocation == getLastPageDataNumber()) {
            return false;
        } else {
            return true;
        }
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getEachPageDataNumber() {
        return eachPageDataNumber;
    }

    public void setEachPageDataNumber(int eachPageDataNumber) {
        this.eachPageDataNumber = eachPageDataNumber;
    }

    public int getTotalDataNumber() {
        return totalDataNumber;
    }

    public void setTotalDataNumber(int totalDataNumber) {
        this.totalDataNumber = totalDataNumber;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public static int getDefaultPageDataNumber() {
        return defaultPageDataNumber;
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentLocation=" + currentLocation +
                ", eachPageDataNumber=" + eachPageDataNumber +
                ", totalDataNumber=" + totalDataNumber +
                ", getTotalPage()=" + getTotalPage() +
                ", getLastPageDataNumber()=" + getLastPageDataNumber() +
                ", hasPrevious()=" + getHasPrevious() +
                ", hasNext()=" + getHasNext() +
                '}';
    }
}
