/* 
 * BlueJeans Meetings REST API
 *
 *  ## Video That Works Where You Do. This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data and current state information. With these APIs you can quickly integrate **BlueJeans** video administration into your applications.    <alert>7/23/2018 </alert>Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> <hr>  <h2 class=\"info\"> What is a BlueJeans Meeting?</h2> <img src=\"./img/bjnmeeting.png\" style=\"padding-left:20px; width:50%\">  A BlueJeans meeting is a collaboration session of 2 or more participants joining a virtual meeting-room in the cloud.   The first person to join is put into a waiting-room until other participant(s) join.  When the meeting starts, all participants will be connected over video & audio.  <u>Types of Meeting Rooms</u> There are two types of Meeting Rooms available to a registered user.  They are described as: <ul> <li>Scheduled – A room created for a specific date and time.  It is assigned a randomized and unique numeric ID by BlueJeans.</li> <li>Personal – Every user is given a personal meeting room with a customized Meeting Identifier.  People typically use their mobile phone number as their Meeting ID.</li> </ul> <u>Meeting Room Security</u> A meeting room can <i>optionally</i> be protected by a randomized access code.  THe access code ensures security of participants who join.  Also the access code can specify a Moderator role whose user(s) have additional capabilities to administer a meeting. <ul> <li>When set, participants would be required to enter the access code in order to join.</li> <li>The scheduler's profile has a user-specified moderator passcode which can be input to allow designated user(s) greater privileges to help organize meetings.</li> </ul> <hr>  <h2 id='gs' class=\"info\" onclick=\"hideit('gs')\"><span id=\"gsicon\" class=\"glyphicon glyphicon-chevron-right\"></span> Getting Started</h2> <div id=\"gsbody\" style=\"display:none\"> Before you start using BlueJeans' APIs, you must first have a BlueJeans account enabled for API Access.  Contact <a href=\"mailto:Support@BlueJeans.com)\">BlueJeans Support</a> for assistance.  <br /><br />Once you have an account, you may start writing application code to authenticate and make API calls.  *Alternatively*, you can use this developer site to test the BlueJeans' APIs and develop a level of familiarity before you write production code.  <br />  ### To Make API Calls from This Site If you want to use this developer site to try various BlueJeans' APIs, here are the steps required to authenticate and enable your Developer Session to place API calls. 1. Choose Method for Authenticating      * Click on the desired Authentication method from below.      * Click on the **Try It Out** button. 1. Make Authentication request      * Follow APIs instructions and input the API parameters.      * Click on the blue **Execute** button.      * If successful, the API returns with JSON data containing a field called **access_token**.  Copy/save this value. 1. Authorize BlueJeans Developer Session.      * Click on the green **Authorize button**.       * The site will show you a pop-up window for authorization.      * Enter your access token in the field named **api_key**      * Click on the **Authorize** button  Your current BlueJeans developer session is now authenticated and ready to place API calls.  The web site will automatically include your access token on any API calls you make. </div> <hr>  <h2 id='oauth' class=\"info\" onclick=\"hideit('oauth')\"><span id=\"oauthicon\" class=\"glyphicon glyphicon-chevron-right\"></span> About Meetings Authentication</h2>  <div id=\"oauthbody\" style=\"display:none\">  All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ### Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform API operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – Authentication for your developer's application occurs through a redirection to a BlueJeans authentication page. The application receives an authorization code to be submitted, along with other tokens, to receive an access token. Known as three-legged OAuth. For more information please refer to the [OAuth specification](https://oauth.net/). ### Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. </div> <hr> 
 *
 * OpenAPI spec version: 1.0.4407232018
 * Contact: glenn@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using com.bluejeans.api.rest.meetings.Client;
using com.bluejeans.api.rest.meetings.Api;
using com.bluejeans.api.rest.meetings.Model;

namespace com.bluejeans.api.rest.meetings.Test
{
    /// <summary>
    ///  Class for testing AuthenticationApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class AuthenticationApiTests
    {
        private AuthenticationApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new AuthenticationApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of AuthenticationApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' AuthenticationApi
            //Assert.IsInstanceOfType(typeof(AuthenticationApi), instance, "instance is a AuthenticationApi");
        }

        
        /// <summary>
        /// Test GetAuthorizationCode
        /// </summary>
        [Test]
        public void GetAuthorizationCodeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string clientId = null;
            //string redirectUri = null;
            //string state = null;
            //string scope = null;
            //string responseType = null;
            //string appName = null;
            //string appLogoUrl = null;
            //instance.GetAuthorizationCode(clientId, redirectUri, state, scope, responseType, appName, appLogoUrl);
            
        }
        
        /// <summary>
        /// Test GetTokenByClient
        /// </summary>
        [Test]
        public void GetTokenByClientTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestClient grantRequestClient = null;
            //var response = instance.GetTokenByClient(grantRequestClient);
            //Assert.IsInstanceOf<GrantClient> (response, "response is GrantClient");
        }
        
        /// <summary>
        /// Test GetTokenByCode
        /// </summary>
        [Test]
        public void GetTokenByCodeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestCode grantRequestCode = null;
            //var response = instance.GetTokenByCode(grantRequestCode);
            //Assert.IsInstanceOf<GrantCode> (response, "response is GrantCode");
        }
        
        /// <summary>
        /// Test GetTokenByMeeting
        /// </summary>
        [Test]
        public void GetTokenByMeetingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestMeeting grantRequestMeeting = null;
            //var response = instance.GetTokenByMeeting(grantRequestMeeting);
            //Assert.IsInstanceOf<GrantMeeting> (response, "response is GrantMeeting");
        }
        
        /// <summary>
        /// Test GetTokenByPassword
        /// </summary>
        [Test]
        public void GetTokenByPasswordTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestPassword grantRequestPassword = null;
            //var response = instance.GetTokenByPassword(grantRequestPassword);
            //Assert.IsInstanceOf<GrantPassword> (response, "response is GrantPassword");
        }
        
        /// <summary>
        /// Test GetTokenByRefresh
        /// </summary>
        [Test]
        public void GetTokenByRefreshTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestRefresh grantRequestRefresh = null;
            //var response = instance.GetTokenByRefresh(grantRequestRefresh);
            //Assert.IsInstanceOf<GrantRefresh> (response, "response is GrantRefresh");
        }
        
        /// <summary>
        /// Test GetTokenInfo
        /// </summary>
        [Test]
        public void GetTokenInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //var response = instance.GetTokenInfo(accessToken);
            //Assert.IsInstanceOf<InlineResponse200> (response, "response is InlineResponse200");
        }
        
        /// <summary>
        /// Test RevokeAccessToken
        /// </summary>
        [Test]
        public void RevokeAccessTokenTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestRevoke grantRequestRevoke = null;
            //string accessToken = null;
            //instance.RevokeAccessToken(grantRequestRevoke, accessToken);
            
        }
        
    }

}
