public class Apple {
    private String color;

    public Apple (String color){
        this.color= color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    @Override
    public boolean equals(Object obj) {
        Orange o =  (Orange) obj; // after overriding apple or orange k objects k colors ko compare karny k lie
//                                    hm ye obj obj ko bna ray hn (due to color comparison)
        // ye nechy down casting h :
       return ( this.getColor() == o.getOrangeColor());// due to comparison we need down casting

    }
}
