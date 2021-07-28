package problem1;

public class State{
	public boolean start()
	{
		return false;
	}
	public boolean stop()
	{
		return false;
	}
	public boolean pause()
	{
		return false;
	}
	public boolean resume()
	{
		return false;
	}
}

public class StartState:public State {
	public boolean start()
	{
		return true;
	}
}
public class StopState:public State {
	public boolean stop()
	{
		return true;
	}
}
public class PauseState:public State {
	public boolean pause()
	{
		return true;
	}
}
public class ResumeState:public State {
	public boolean resume()
	{
		return true;
	}
}



public class StopWatch {
	
	
	public boolean start(State s)
	{
		
		return s.start();
	}
	public boolean stop(State s)
	{
		
		return s.stop();
	}
	public boolean pause(State s)
	{
		
		return s.pause();
	}
	public boolean resume(State s)
	{
		
		return s.resume();
	}
}
