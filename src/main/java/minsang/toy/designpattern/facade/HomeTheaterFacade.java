package minsang.toy.designpattern.facade;

public class HomeTheaterFacade {
    PopcornPoppper popper;
    Projector projector;
    StreamingPlayer player;

    public void watchMovie(String movie) {
        popper.on();
        popper.pop();
        projector.on();
        player.on();
        player.play();
    }
}
