package org.example.structuralPattern.facade;

/**
 * packageName    : org.example.structuralPattern.facade
 * fileName       : HomeTheaterFacade
 * author         : heon
 * date           : 2024-02-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-28           heon               최초 생성
 */
public class HomeTheaterFacade {
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    Popcorn popcorn;

    public HomeTheaterFacade(StreamingPlayer player,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             Popcorn popcorn) {

        this.player = player;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popcorn = popcorn;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popcorn.eat();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        player.on();
        player.play(movie);
    }


    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popcorn.throwAway();
        lights.on();
        screen.up();
        projector.off();
        player.stop();
        player.off();
    }
}
