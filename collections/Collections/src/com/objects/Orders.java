package com.objects;

import java.util.Objects;

public class Orders implements Comparable<Orders> {
    private String orderNum;
    private String item1Name;
    //private String item1Cost;
//    private Integer item1Cost;
    private int item1Cost;
    private String item2Name;
    private String item2Cost;
    private String item3Name;
    private String item3Cost;


    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getItem1Name() {
        return item1Name;
    }

    public void setItem1Name(String item1Name) {
        this.item1Name = item1Name;
    }

//    public String getItem1Cost() {
//        return item1Cost;
//    }
//
//    public void setItem1Cost(String item1Cost) {
//        this.item1Cost = item1Cost;
//    }


    public int getItem1Cost() {
        return item1Cost;
    }

    public void setItem1Cost(int item1Cost) {
        this.item1Cost = item1Cost;
    }

    public String getItem2Name() {
        return item2Name;
    }

    public void setItem2Name(String item2Name) {
        this.item2Name = item2Name;
    }

    public String getItem2Cost() {
        return item2Cost;
    }

    public void setItem2Cost(String item2Cost) {
        this.item2Cost = item2Cost;
    }

    public String getItem3Name() {
        return item3Name;
    }

    public void setItem3Name(String item3Name) {
        this.item3Name = item3Name;
    }

    public String getItem3Cost() {
        return item3Cost;
    }

    public void setItem3Cost(String item3Cost) {
        this.item3Cost = item3Cost;
    }

    @Override
    public String toString() {
      String orderString= "ordernum".concat(orderNum).concat("::").
                           concat("item1Name").concat(item1Name).concat("::").concat("item1Cost").
                           concat(new Integer(item1Cost).toString()).concat("::").
//                           concat(item1Cost.toString()).concat("::").
//                           concat(item1Cost).concat("::").
                           concat("item2Name").concat(item2Name).concat("::").concat("item2Cost").concat(item2Cost).concat("::").
                           concat("item3Name").concat(item3Name).concat("::").concat("item3Cost").concat(item3Cost);
      return orderString;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual=false;
        if (!(obj instanceof Orders)){
            return isEqual;
        }else{
            Orders nextOrder=(Orders) obj;
            if (this.orderNum.equals(nextOrder.getOrderNum())){
                if (this.item1Name.equals(nextOrder.getItem1Name())){
                    if (this.item1Cost == nextOrder.getItem1Cost()){
                        if (this.item2Name.equals(nextOrder.getItem2Cost())){
                            if (this.item2Cost.equals(nextOrder.getItem2Cost())){
                                if (this.item3Name.equals(nextOrder.getItem3Name())){
                                    if (this.item3Cost.equals(nextOrder.getItem3Cost())){
                                        isEqual=true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return isEqual;
        }
    }

    @Override
    public int hashCode() {
        int hashcode=37;
        if(orderNum!=null)
            hashcode=hashcode+orderNum.hashCode();
        if (item1Name!=null)
          hashcode=hashcode+31*item1Name.hashCode();
        if (item1Cost!=0)
          hashcode=hashcode+29*item1Cost;
        if (item2Name!=null)
            hashcode=hashcode+17*item2Name.hashCode();
        if(item2Cost!=null)
           hashcode=hashcode+13*item2Cost.hashCode();
        if (item3Name!=null)
            hashcode=hashcode+11*item3Name.hashCode();
        if (item3Cost!=null)
            hashcode=hashcode+7*item3Cost.hashCode();

        return hashcode;
    }

    public int compareTo(Orders otherOrders) {
        int BEFORE = -1;
        int AFTER = 1;
        int EQUAL = 0;

        if (this.orderNum.compareTo(otherOrders.getOrderNum())<0) {
            return BEFORE;
        }else if (this.orderNum.compareTo(otherOrders.getOrderNum())>0) {
            return AFTER;
        } else
               return EQUAL;
    }
}