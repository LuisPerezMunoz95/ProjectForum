package selenium.tests;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AddNewPostToThreadAnalisisTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void addNewPostToThreadAnalisis() {
    // Test name: AddNewPostToThreadAnalisis
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:3000/");
    // 2 | setWindowSize | 1237x667 | 
    driver.manage().window().setSize(new Dimension(1237, 667));
    // 3 | click | css=.card:nth-child(1) .card-title | 
    driver.findElement(By.cssSelector(".card:nth-child(1) .card-title")).click();
    // 4 | click | id=list-question-list | 
    driver.findElement(By.id("list-question-list")).click();
    // 5 | click | id=list-suggestion-list | 
    driver.findElement(By.id("list-suggestion-list")).click();
    // 6 | click | id=list-clarification-list | 
    driver.findElement(By.id("list-clarification-list")).click();
    // 7 | click | css=.btn-outline-primary | 
    driver.findElement(By.cssSelector(".btn-outline-primary")).click();
    // 8 | click | id=inputAddress | 
    driver.findElement(By.id("inputAddress")).click();
    // 9 | click | id=inputAddress | 
    driver.findElement(By.id("inputAddress")).click();
    // 10 | type | id=inputAddress | how can i make a react component to update after first api call?
    driver.findElement(By.id("inputAddress")).sendKeys("how can i make a react component to update after first api call?");
    // 11 | click | id=exampleFormControlTextarea1 | 
    driver.findElement(By.id("exampleFormControlTextarea1")).click();
    // 12 | click | id=exampleFormControlTextarea1 | 
    driver.findElement(By.id("exampleFormControlTextarea1")).click();
    // 13 | type | id=exampleFormControlTextarea1 | when I call the API for the first time it will render the react component correctly with the information from the response, if I try to call the API again to get a new response, I get the new body response but the react component remains the same it doesn't update.\n\nwhen I console log the new response data, the console does display the new information but I haven't been able to make the componenet rerender it.\n\nimport React from "react";\nimport styled from "styled-components";\nimport {connect} from 'react-redux';\nimport {fetchCv} from '../Actions';//--->fucntion will axios post\nimport Example from '../Components/ReactToPrint'//--->should render responses\nimport { SpinnerInfinity } from 'spinners-react';\nimport { FaArrowCircleDown } from 'react-icons/fa';\n\n\n\n\n\n\n\n\nclass DataList extends React.Component {\n\n  CodeStatus = this.props.posts.status;\n\n  state = {\n    // Initially, no file is selected\n    selectedFile: null,\n    cargar: true,\n    loader: false,\n    check: false,\n  };\n\n  onFileChange = (event) => {\n    // Update the file state\n this.setState({ selectedFile: event.target.files[0] });\n\n    // show emailIcon\n\n    if (this.state.cargar === true) {\n      this.setState({ cargar: false });\n      this.setState({ loader: true });\n      this.setState({ check: false });\n    } else if (this.CodeStatus === 200) {\n      this.setState({ cargar: false });\n      this.setState({ loader: false });\n      this.setState({ check: false });\n    }\n  };\n\n\n//posts file to api adn get response\n  onFileUpload = async (fetched) => {\n    await fetched;\n    // Create an object of formData\n    const formData = new FormData();\n\n    // Update the formData object\n    formData.append("file", this.state.selectedFile);\n\n    // Details of the uploaded file\n\n    this.props.fetchCv(formData).then((result) => {\n      if (result) {\n        this.setState({check:true});\n        this.setState({laoder:false});\n        \n        return result;\n      }else{\n        this.setState({cargar:true});\n        this.setState({loader:false});\n        this.setState({check:false});\n       }\n    });\n  };\n\n\n  twoCalls = (e) => {\n    // On file select (from the pop up)\n    this.onFileChange(e);\n\n    // On file upload (click the upload button)\n    this.onFileUpload();\n\n  };\n\n\n  render() {\n  console.log(this.props.posts)//-->logs new body response everytime api is called\n    return (\n      <Container>\n        \n        <Done>\n          {this.CodeStatus == 200 ? <span>Analisis Completo <FaArrowCircleDown style={{Animation:"animationDown 3s infinite"}}/></span>: <span>Salvando otras galaxias</span> }\n        </Done>\n        {this.state.cargar === true ? (\n          <Uploader>\n              <label htmlFor={"upload-button"}>\n              <span></span>\n              <span></span>\n              <span></span>\n              <span></span>\n              <div className="button">Cargar Cv</div>\n            </label>\n            <input\n              id="upload-button"\n              style={{ display: "none" }}\n              accept="application/pdf, application/vnd.openxmlformats-officedocument.wordprocessingml.document"\n              type="file"\n              onChange={this.twoCalls}\n            />\n          </Uploader>\n        ) : null}\n        <Loader>\n          {this.state.cargar === false ?  <SpinnerInfinity size={100}/> :  null}\n        </Loader>\n        {this.state.isVisible ? <Example /> : null}//-->component that wont update with response\n        {this.CodeStatus == 200 ? <Fly>\n        <img className="fly" src="/images/ufo.png" alt="ufo"/>\n        <img className="fly2" src="/images/apolo.png" alt="rocket"/>\n        <img className="p1" src="/images/PlanetsList/1.png" alt="planet"/>\n        <img className="p2" src="/images/PlanetsList/2.png" alt="planet"/>\n        <img className="p3" src="/images/PlanetsList/3.png" alt="planet"/>\n        <img className="p4" src="/images/PlanetsList/4.png" alt="planet"/>\n        <img className="p5" src="/images/PlanetsList/5.png" alt="planet"/>\n        <img className="p6" src="/images/PlanetsList/6.png" alt="planet"/>\n        </Fly>:null}\n      </Container>\n    );\n  }\n}\n\n\n// our state object will have a prop called data, that contains all of the data return from the reducer\n\nfunction mapStateToProps(state) {\n\n  return {\n    posts: state.posts\n  };\n\n}\n\nexport default connect(mapStateToProps,{fetchCv})(DataList);
    driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("when I call the API for the first time it will render the react component correctly with the information from the response, if I try to call the API again to get a new response, I get the new body response but the react component remains the same it doesn\'t update.\\n\\nwhen I console log the new response data, the console does display the new information but I haven\'t been able to make the componenet rerender it.\\n\\nimport React from \"react\";\\nimport styled from \"styled-components\";\\nimport {connect} from \'react-redux\';\\nimport {fetchCv} from \'../Actions\';//--->fucntion will axios post\\nimport Example from \'../Components/ReactToPrint\'//--->should render responses\\nimport { SpinnerInfinity } from \'spinners-react\';\\nimport { FaArrowCircleDown } from \'react-icons/fa\';\\n\\n\\n\\n\\n\\n\\n\\n\\nclass DataList extends React.Component {\\n\\n  CodeStatus = this.props.posts.status;\\n\\n  state = {\\n    // Initially, no file is selected\\n    selectedFile: null,\\n    cargar: true,\\n    loader: false,\\n    check: false,\\n  };\\n\\n  onFileChange = (event) => {\\n    // Update the file state\\n this.setState({ selectedFile: event.target.files[0] });\\n\\n    // show emailIcon\\n\\n    if (this.state.cargar === true) {\\n      this.setState({ cargar: false });\\n      this.setState({ loader: true });\\n      this.setState({ check: false });\\n    } else if (this.CodeStatus === 200) {\\n      this.setState({ cargar: false });\\n      this.setState({ loader: false });\\n      this.setState({ check: false });\\n    }\\n  };\\n\\n\\n//posts file to api adn get response\\n  onFileUpload = async (fetched) => {\\n    await fetched;\\n    // Create an object of formData\\n    const formData = new FormData();\\n\\n    // Update the formData object\\n    formData.append(\"file\", this.state.selectedFile);\\n\\n    // Details of the uploaded file\\n\\n    this.props.fetchCv(formData).then((result) => {\\n      if (result) {\\n        this.setState({check:true});\\n        this.setState({laoder:false});\\n        \\n        return result;\\n      }else{\\n        this.setState({cargar:true});\\n        this.setState({loader:false});\\n        this.setState({check:false});\\n       }\\n    });\\n  };\\n\\n\\n  twoCalls = (e) => {\\n    // On file select (from the pop up)\\n    this.onFileChange(e);\\n\\n    // On file upload (click the upload button)\\n    this.onFileUpload();\\n\\n  };\\n\\n\\n  render() {\\n  console.log(this.props.posts)//-->logs new body response everytime api is called\\n    return (\\n      <Container>\\n        \\n        <Done>\\n          {this.CodeStatus == 200 ? <span>Analisis Completo <FaArrowCircleDown style={{Animation:\"animationDown 3s infinite\"}}/></span>: <span>Salvando otras galaxias</span> }\\n        </Done>\\n        {this.state.cargar === true ? (\\n          <Uploader>\\n              <label htmlFor={\"upload-button\"}>\\n              <span></span>\\n              <span></span>\\n              <span></span>\\n              <span></span>\\n              <div className=\"button\">Cargar Cv</div>\\n            </label>\\n            <input\\n              id=\"upload-button\"\\n              style={{ display: \"none\" }}\\n              accept=\"application/pdf, application/vnd.openxmlformats-officedocument.wordprocessingml.document\"\\n              type=\"file\"\\n              onChange={this.twoCalls}\\n            />\\n          </Uploader>\\n        ) : null}\\n        <Loader>\\n          {this.state.cargar === false ?  <SpinnerInfinity size={100}/> :  null}\\n        </Loader>\\n        {this.state.isVisible ? <Example /> : null}//-->component that wont update with response\\n        {this.CodeStatus == 200 ? <Fly>\\n        <img className=\"fly\" src=\"/images/ufo.png\" alt=\"ufo\"/>\\n        <img className=\"fly2\" src=\"/images/apolo.png\" alt=\"rocket\"/>\\n        <img className=\"p1\" src=\"/images/PlanetsList/1.png\" alt=\"planet\"/>\\n        <img className=\"p2\" src=\"/images/PlanetsList/2.png\" alt=\"planet\"/>\\n        <img className=\"p3\" src=\"/images/PlanetsList/3.png\" alt=\"planet\"/>\\n        <img className=\"p4\" src=\"/images/PlanetsList/4.png\" alt=\"planet\"/>\\n        <img className=\"p5\" src=\"/images/PlanetsList/5.png\" alt=\"planet\"/>\\n        <img className=\"p6\" src=\"/images/PlanetsList/6.png\" alt=\"planet\"/>\\n        </Fly>:null}\\n      </Container>\\n    );\\n  }\\n}\\n\\n\\n// our state object will have a prop called data, that contains all of the data return from the reducer\\n\\nfunction mapStateToProps(state) {\\n\\n  return {\\n    posts: state.posts\\n  };\\n\\n}\\n\\nexport default connect(mapStateToProps,{fetchCv})(DataList);");
    // 14 | click | css=.btn-primary | 
    driver.findElement(By.cssSelector(".btn-primary")).click();
    // 15 | mouseOver | css=.btn-primary | 
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-primary"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 16 | mouseOut | css=.btn-primary | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 17 | click | id=list-question-list | 
    driver.findElement(By.id("list-question-list")).click();
    // 18 | click | id=list-suggestion-list | 
    driver.findElement(By.id("list-suggestion-list")).click();
    // 19 | click | id=list-clarification-list | 
    driver.findElement(By.id("list-clarification-list")).click();
    // 20 | click | id=list-suggestion-list | 
    driver.findElement(By.id("list-suggestion-list")).click();
    // 21 | click | id=list-question-list | 
    driver.findElement(By.id("list-question-list")).click();
    // 22 | close |  | 
    driver.close();
  }
}
