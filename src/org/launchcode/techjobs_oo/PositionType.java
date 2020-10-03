package org.launchcode.techjobs_oo;

public class PositionType extends JobField{

    public PositionType() {
        super();
    }

    public PositionType(String value) {
        super(value);
    }

    @Override
    public boolean equals (Object o){
        if(this == o)
            return true;
        if (!(o instanceof PositionType))
            return false;
        PositionType that = (PositionType) o;
        return super.getId() == that.getId();
    }

}
