package $package$

import org.afabl._

class $worldName$ extends World[$worldName$State, $worldName$Action] {

  def init = $worldName$State()

  def act(state: $worldName$State, action: $worldName$Action) = {
    // Implement the dynamics of your world here.
    //Default is to stay in the start state
    $worldName$State()
  }
}
