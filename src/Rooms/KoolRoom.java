package Rooms;

import People.Person;


public class  KoolRoom extends Room {

    public KoolRoom(int x, int y) {
        super(x, y);
    }

    public void enterRoom(Person x) {
        System.out.println("You enter a really cool room. You look left and you see fan then you look right and see an air conditioner");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
}
