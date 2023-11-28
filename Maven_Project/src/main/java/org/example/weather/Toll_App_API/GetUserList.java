package org.example.weather.Toll_App_API;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetUserList {

    public Response getUserList() {
        GetToken token=new GetToken();
        String newToken=token.generateToken();

        RestAssured.baseURI="https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev";
        String resource="/cognito-user-list";
        String auth="Bearer "+newToken;



        Response re = given()
                .header("Authorization",auth)

                .get(resource);
        System.out.println(re.prettyPrint());
        return re;
    }
}
