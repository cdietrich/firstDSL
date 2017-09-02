package sample;

import com.google.common.base.Objects;
import imdb.Actor;
import imdb.Film;

@SuppressWarnings("all")
public class Sample {
  private Actor Actor;
  
  private Film Film;
  
  public boolean op0() {
    return ((this.Actor.getPlays().size() > 1) && Objects.equal(this.Film.getTitle(), "Godzilla"));
  }
}
