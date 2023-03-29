package api.test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import api.utilities.DataProviders;
import org.testng.annotations.Test;

public class DDTests {

    @Test(priority = 1, dataProvider = "testdata", dataProviderClass = DataProviders.class)
    public void testPostUsers(String userName, String fName, String lName, String email, String pwd, String ph){

        User userPayload = new User();

        userPayload.setUserName(userName);
        userPayload.setFirstName(fName);
        userPayload.setLastName(lName);
        userPayload.setEmail(email);
        userPayload.setPassword(pwd);
        userPayload.setPhone(ph);

        Response response = UserEndPoints.createUser(userPayload);
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println(response.getStatusCode());
        System.out.println(response.prettyPrint());
        System.out.println(userPayload);
        System.out.println("User Created Successfully");

    }

    @Test(priority = 2, dataProvider = "UserNames", dataProviderClass = DataProviders.class)
    public void testDeleteUsers(String userName){
        Response response = UserEndPoints.deleteUser(userName);
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println("User Deleted Successfully");


    }
}
