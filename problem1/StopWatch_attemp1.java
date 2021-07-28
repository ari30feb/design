package problem1;

public interface State{
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

public class StartState implements State {
	public boolean start()
	{
		return true;
	}
}
public class StopState implements State {
	public boolean stop()
	{
		return true;
	}
}
public class PauseState implements State {
	public boolean pause()
	{
		return true;
	}
}
public class ResumeState implements State {
	public boolean resume()
	{
		return true;
	}
}



public class StopWatch {
	
	State s;
	
	public void changeState(State newState)
	{
		s = newState;
	}
	
	public boolean start()
	{
		
		return s.start();
	}
	public boolean stop()
	{
		
		return s.stop();
	}
	public boolean pause()
	{
		
		return s.pause();
	}
	public boolean resume()
	{
		
		return s.resume();
	}
}
