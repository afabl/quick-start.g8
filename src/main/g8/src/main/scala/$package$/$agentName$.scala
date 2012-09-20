package $package$

import org.afabl._

/**
 * The main agent for this world.
 */
class $agentName$(id: Int, name: String)
  extends AfablAgent[$worldName$State, $worldName$Action](id, name) 
  with $arbitrator$[$worldName$State, $worldName$Action] {

  /**
   * The drives (goal-oriented) of this agent.
   */
  val drives = IndexedSeq(new $firstDrive$[$worldName$State, $firstDrive$State, $worldName$Action])
}
