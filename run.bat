java -jar selenium-server-standalone-3.141.59.jar -role hub

E:\education>java -Dwebdriver.chrome.driver=E:\education\EclipseWorkspace\DemoGrid\Driver\chromedriver.exe -jar selenium-server-standalone-3.141.5
9.jar -role node -hub http://localhost:4444/grid/register -port 5555

java -Dwebdriver.gecko.driver=E:\education\EclipseWorkspace\DemoGrid\Driver\geckodriver.exe -jar selenium-server-standalone-3.141.5
9.jar -role node -hub http://localhost:4444/grid/register -port 5554