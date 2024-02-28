public class Apple {
    private String name;
    public Apple(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        Orange o = (Orange ) obj; //due to color comparison we need this
        return this.getname() == o.getColor(); // for argument bases comparision we need this

    }
}