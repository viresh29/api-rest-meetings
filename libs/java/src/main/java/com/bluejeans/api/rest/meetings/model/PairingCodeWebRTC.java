/*
 * BlueJeans Meetings REST API
 *  ## Video That Works Where You Do. This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data and current state information. With these APIs you can quickly integrate **BlueJeans** video administration into your applications.    <alert>7/23/2018 </alert>Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> <hr>  <h2 class=\"info\"> What is a BlueJeans Meeting?</h2> <img src=\"./img/bjnmeeting.png\" style=\"padding-left:20px; width:50%\">  A BlueJeans meeting is a collaboration session of 2 or more participants joining a virtual meeting-room in the cloud.   The first person to join is put into a waiting-room until other participant(s) join.  When the meeting starts, all participants will be connected over video & audio.  <u>Types of Meeting Rooms</u> There are two types of Meeting Rooms available to a registered user.  They are described as: <ul> <li>Scheduled – A room created for a specific date and time.  It is assigned a randomized and unique numeric ID by BlueJeans.</li> <li>Personal – Every user is given a personal meeting room with a customized Meeting Identifier.  People typically use their mobile phone number as their Meeting ID.</li> </ul> <u>Meeting Room Security</u> A meeting room can <i>optionally</i> be protected by a randomized access code.  THe access code ensures security of participants who join.  Also the access code can specify a Moderator role whose user(s) have additional capabilities to administer a meeting. <ul> <li>When set, participants would be required to enter the access code in order to join.</li> <li>The scheduler's profile has a user-specified moderator passcode which can be input to allow designated user(s) greater privileges to help organize meetings.</li> </ul> <hr>  <h2 id='gs' class=\"info\" onclick=\"hideit('gs')\"><span id=\"gsicon\" class=\"glyphicon glyphicon-chevron-right\"></span> Getting Started</h2> <div id=\"gsbody\" style=\"display:none\"> Before you start using BlueJeans' APIs, you must first have a BlueJeans account enabled for API Access.  Contact <a href=\"mailto:Support@BlueJeans.com)\">BlueJeans Support</a> for assistance.  <br /><br />Once you have an account, you may start writing application code to authenticate and make API calls.  *Alternatively*, you can use this developer site to test the BlueJeans' APIs and develop a level of familiarity before you write production code.  <br />  ### To Make API Calls from This Site If you want to use this developer site to try various BlueJeans' APIs, here are the steps required to authenticate and enable your Developer Session to place API calls. 1. Choose Method for Authenticating      * Click on the desired Authentication method from below.      * Click on the **Try It Out** button. 1. Make Authentication request      * Follow APIs instructions and input the API parameters.      * Click on the blue **Execute** button.      * If successful, the API returns with JSON data containing a field called **access_token**.  Copy/save this value. 1. Authorize BlueJeans Developer Session.      * Click on the green **Authorize button**.       * The site will show you a pop-up window for authorization.      * Enter your access token in the field named **api_key**      * Click on the **Authorize** button  Your current BlueJeans developer session is now authenticated and ready to place API calls.  The web site will automatically include your access token on any API calls you make. </div> <hr>  <h2 id='oauth' class=\"info\" onclick=\"hideit('oauth')\"><span id=\"oauthicon\" class=\"glyphicon glyphicon-chevron-right\"></span> About Meetings Authentication</h2>  <div id=\"oauthbody\" style=\"display:none\">  All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ### Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform API operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – Authentication for your developer's application occurs through a redirection to a BlueJeans authentication page. The application receives an authorization code to be submitted, along with other tokens, to receive an access token. Known as three-legged OAuth. For more information please refer to the [OAuth specification](https://oauth.net/). ### Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. </div> <hr> 
 *
 * OpenAPI spec version: 1.0.4407232018
 * Contact: glenn@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bluejeans.api.rest.meetings.model;

import java.util.Objects;
import java.util.Arrays;
import com.bluejeans.api.rest.meetings.model.PairingCodeSIPTurnservers;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PairingCodeWebRTC
 */

public class PairingCodeWebRTC {
  @SerializedName("callguid")
  private String callguid = null;

  @SerializedName("endpointGuid")
  private String endpointGuid = null;

  @SerializedName("forceTURN")
  private Boolean forceTURN = null;

  @SerializedName("pairingCode")
  private String pairingCode = null;

  @SerializedName("status")
  private Integer status = null;

  /**
   * Gets or Sets statusText
   */
  @JsonAdapter(StatusTextEnum.Adapter.class)
  public enum StatusTextEnum {
    OK("OK");

    private String value;

    StatusTextEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusTextEnum fromValue(String text) {
      for (StatusTextEnum b : StatusTextEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusTextEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusTextEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusTextEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusTextEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("statusText")
  private StatusTextEnum statusText = null;

  @SerializedName("turnservers")
  private List<PairingCodeSIPTurnservers> turnservers = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("seamEndpointGuid")
  private String seamEndpointGuid = null;

  @SerializedName("connectionGuid")
  private String connectionGuid = null;

  @SerializedName("endpointName")
  private String endpointName = null;

  public PairingCodeWebRTC callguid(String callguid) {
    this.callguid = callguid;
    return this;
  }

   /**
   * Get callguid
   * @return callguid
  **/
  @ApiModelProperty(value = "")
  public String getCallguid() {
    return callguid;
  }

  public void setCallguid(String callguid) {
    this.callguid = callguid;
  }

  public PairingCodeWebRTC endpointGuid(String endpointGuid) {
    this.endpointGuid = endpointGuid;
    return this;
  }

   /**
   * Get endpointGuid
   * @return endpointGuid
  **/
  @ApiModelProperty(value = "")
  public String getEndpointGuid() {
    return endpointGuid;
  }

  public void setEndpointGuid(String endpointGuid) {
    this.endpointGuid = endpointGuid;
  }

  public PairingCodeWebRTC forceTURN(Boolean forceTURN) {
    this.forceTURN = forceTURN;
    return this;
  }

   /**
   * Get forceTURN
   * @return forceTURN
  **/
  @ApiModelProperty(value = "")
  public Boolean isForceTURN() {
    return forceTURN;
  }

  public void setForceTURN(Boolean forceTURN) {
    this.forceTURN = forceTURN;
  }

  public PairingCodeWebRTC pairingCode(String pairingCode) {
    this.pairingCode = pairingCode;
    return this;
  }

   /**
   * Get pairingCode
   * @return pairingCode
  **/
  @ApiModelProperty(value = "")
  public String getPairingCode() {
    return pairingCode;
  }

  public void setPairingCode(String pairingCode) {
    this.pairingCode = pairingCode;
  }

  public PairingCodeWebRTC status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PairingCodeWebRTC statusText(StatusTextEnum statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * Get statusText
   * @return statusText
  **/
  @ApiModelProperty(value = "")
  public StatusTextEnum getStatusText() {
    return statusText;
  }

  public void setStatusText(StatusTextEnum statusText) {
    this.statusText = statusText;
  }

  public PairingCodeWebRTC turnservers(List<PairingCodeSIPTurnservers> turnservers) {
    this.turnservers = turnservers;
    return this;
  }

  public PairingCodeWebRTC addTurnserversItem(PairingCodeSIPTurnservers turnserversItem) {
    if (this.turnservers == null) {
      this.turnservers = new ArrayList<PairingCodeSIPTurnservers>();
    }
    this.turnservers.add(turnserversItem);
    return this;
  }

   /**
   * Get turnservers
   * @return turnservers
  **/
  @ApiModelProperty(value = "")
  public List<PairingCodeSIPTurnservers> getTurnservers() {
    return turnservers;
  }

  public void setTurnservers(List<PairingCodeSIPTurnservers> turnservers) {
    this.turnservers = turnservers;
  }

  public PairingCodeWebRTC uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public PairingCodeWebRTC seamEndpointGuid(String seamEndpointGuid) {
    this.seamEndpointGuid = seamEndpointGuid;
    return this;
  }

   /**
   * Globally unique identifier associated with the media component of this endpoint for this meeting.  (Typically a string starting with \&quot;seamguid:\&quot;)
   * @return seamEndpointGuid
  **/
  @ApiModelProperty(value = "Globally unique identifier associated with the media component of this endpoint for this meeting.  (Typically a string starting with \"seamguid:\")")
  public String getSeamEndpointGuid() {
    return seamEndpointGuid;
  }

  public void setSeamEndpointGuid(String seamEndpointGuid) {
    this.seamEndpointGuid = seamEndpointGuid;
  }

  public PairingCodeWebRTC connectionGuid(String connectionGuid) {
    this.connectionGuid = connectionGuid;
    return this;
  }

   /**
   * Globally unique identifier associated with this endpoint in this meeting. (Typically a string starting with \&quot;connguid:\&quot;)
   * @return connectionGuid
  **/
  @ApiModelProperty(value = "Globally unique identifier associated with this endpoint in this meeting. (Typically a string starting with \"connguid:\")")
  public String getConnectionGuid() {
    return connectionGuid;
  }

  public void setConnectionGuid(String connectionGuid) {
    this.connectionGuid = connectionGuid;
  }

  public PairingCodeWebRTC endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @ApiModelProperty(value = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PairingCodeWebRTC pairingCodeWebRTC = (PairingCodeWebRTC) o;
    return Objects.equals(this.callguid, pairingCodeWebRTC.callguid) &&
        Objects.equals(this.endpointGuid, pairingCodeWebRTC.endpointGuid) &&
        Objects.equals(this.forceTURN, pairingCodeWebRTC.forceTURN) &&
        Objects.equals(this.pairingCode, pairingCodeWebRTC.pairingCode) &&
        Objects.equals(this.status, pairingCodeWebRTC.status) &&
        Objects.equals(this.statusText, pairingCodeWebRTC.statusText) &&
        Objects.equals(this.turnservers, pairingCodeWebRTC.turnservers) &&
        Objects.equals(this.uri, pairingCodeWebRTC.uri) &&
        Objects.equals(this.seamEndpointGuid, pairingCodeWebRTC.seamEndpointGuid) &&
        Objects.equals(this.connectionGuid, pairingCodeWebRTC.connectionGuid) &&
        Objects.equals(this.endpointName, pairingCodeWebRTC.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callguid, endpointGuid, forceTURN, pairingCode, status, statusText, turnservers, uri, seamEndpointGuid, connectionGuid, endpointName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PairingCodeWebRTC {\n");
    
    sb.append("    callguid: ").append(toIndentedString(callguid)).append("\n");
    sb.append("    endpointGuid: ").append(toIndentedString(endpointGuid)).append("\n");
    sb.append("    forceTURN: ").append(toIndentedString(forceTURN)).append("\n");
    sb.append("    pairingCode: ").append(toIndentedString(pairingCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    turnservers: ").append(toIndentedString(turnservers)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    seamEndpointGuid: ").append(toIndentedString(seamEndpointGuid)).append("\n");
    sb.append("    connectionGuid: ").append(toIndentedString(connectionGuid)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

