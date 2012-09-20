package $package$

import org.afabl._

class $firstDrive$[$worldName$State, $firstDrive$State, $worldName$Action]
  extends Drive[$worldName$State, $firstDrive$State, $worldName$Action] {

  def getActions(state: $worldName$State) = IndexedSeq[$worldName$Action]()
}

case class $firstDrive$State
