public class StopWatch {
int currentState = 0;
boolean[][] allowedStates = [[false, true, false],
[true, false, true],
[true, true, false]];
public boolean start()
{

currentState= 1;
return allowedStates[currentState][1];
}
public boolean stop()
{
currentState= 0;
return allowedStates[currentState][0];
}
public boolean pause()
{
currentState= 2;
return allowedStates[currentState][2];
}
public boolean resume()
{
currentState= 1;
return allowedStates[currentState][1];
}
}