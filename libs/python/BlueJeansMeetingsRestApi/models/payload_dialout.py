# coding: utf-8

"""
    BlueJeans Meetings REST API

     ## Video That Works Where You Do. This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data and current state information. With these APIs you can quickly integrate **BlueJeans** video administration into your applications.    <alert>7/23/2018 </alert>Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> <hr>  <h2 class=\"info\"> What is a BlueJeans Meeting?</h2> <img src=\"./img/bjnmeeting.png\" style=\"padding-left:20px; width:50%\">  A BlueJeans meeting is a collaboration session of 2 or more participants joining a virtual meeting-room in the cloud.   The first person to join is put into a waiting-room until other participant(s) join.  When the meeting starts, all participants will be connected over video & audio.  <u>Types of Meeting Rooms</u> There are two types of Meeting Rooms available to a registered user.  They are described as: <ul> <li>Scheduled – A room created for a specific date and time.  It is assigned a randomized and unique numeric ID by BlueJeans.</li> <li>Personal – Every user is given a personal meeting room with a customized Meeting Identifier.  People typically use their mobile phone number as their Meeting ID.</li> </ul> <u>Meeting Room Security</u> A meeting room can <i>optionally</i> be protected by a randomized access code.  THe access code ensures security of participants who join.  Also the access code can specify a Moderator role whose user(s) have additional capabilities to administer a meeting. <ul> <li>When set, participants would be required to enter the access code in order to join.</li> <li>The scheduler's profile has a user-specified moderator passcode which can be input to allow designated user(s) greater privileges to help organize meetings.</li> </ul> <hr>  <h2 id='gs' class=\"info\" onclick=\"hideit('gs')\"><span id=\"gsicon\" class=\"glyphicon glyphicon-chevron-right\"></span> Getting Started</h2> <div id=\"gsbody\" style=\"display:none\"> Before you start using BlueJeans' APIs, you must first have a BlueJeans account enabled for API Access.  Contact <a href=\"mailto:Support@BlueJeans.com)\">BlueJeans Support</a> for assistance.  <br /><br />Once you have an account, you may start writing application code to authenticate and make API calls.  *Alternatively*, you can use this developer site to test the BlueJeans' APIs and develop a level of familiarity before you write production code.  <br />  ### To Make API Calls from This Site If you want to use this developer site to try various BlueJeans' APIs, here are the steps required to authenticate and enable your Developer Session to place API calls. 1. Choose Method for Authenticating      * Click on the desired Authentication method from below.      * Click on the **Try It Out** button. 1. Make Authentication request      * Follow APIs instructions and input the API parameters.      * Click on the blue **Execute** button.      * If successful, the API returns with JSON data containing a field called **access_token**.  Copy/save this value. 1. Authorize BlueJeans Developer Session.      * Click on the green **Authorize button**.       * The site will show you a pop-up window for authorization.      * Enter your access token in the field named **api_key**      * Click on the **Authorize** button  Your current BlueJeans developer session is now authenticated and ready to place API calls.  The web site will automatically include your access token on any API calls you make. </div> <hr>  <h2 id='oauth' class=\"info\" onclick=\"hideit('oauth')\"><span id=\"oauthicon\" class=\"glyphicon glyphicon-chevron-right\"></span> About Meetings Authentication</h2>  <div id=\"oauthbody\" style=\"display:none\">  All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ### Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform API operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – Authentication for your developer's application occurs through a redirection to a BlueJeans authentication page. The application receives an authorization code to be submitted, along with other tokens, to receive an access token. Known as three-legged OAuth. For more information please refer to the [OAuth specification](https://oauth.net/). ### Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. </div> <hr>   # noqa: E501

    OpenAPI spec version: 1.0.4407232018
    Contact: glenn@bluejeans.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class PayloadDialout(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'connection_guid': 'str',
        'country_code': 'int',
        'paired_participant_guid': 'str',
        'phone_number': 'str'
    }

    attribute_map = {
        'connection_guid': 'connectionGuid',
        'country_code': 'countryCode',
        'paired_participant_guid': 'pairedParticipantGuid',
        'phone_number': 'phoneNumber'
    }

    def __init__(self, connection_guid=None, country_code=None, paired_participant_guid=None, phone_number=None):  # noqa: E501
        """PayloadDialout - a model defined in Swagger"""  # noqa: E501

        self._connection_guid = None
        self._country_code = None
        self._paired_participant_guid = None
        self._phone_number = None
        self.discriminator = None

        if connection_guid is not None:
            self.connection_guid = connection_guid
        if country_code is not None:
            self.country_code = country_code
        if paired_participant_guid is not None:
            self.paired_participant_guid = paired_participant_guid
        if phone_number is not None:
            self.phone_number = phone_number

    @property
    def connection_guid(self):
        """Gets the connection_guid of this PayloadDialout.  # noqa: E501

        Globally unique identifier associated with this endpoint in this meeting. (Typically a string starting with \"connguid:\")  # noqa: E501

        :return: The connection_guid of this PayloadDialout.  # noqa: E501
        :rtype: str
        """
        return self._connection_guid

    @connection_guid.setter
    def connection_guid(self, connection_guid):
        """Sets the connection_guid of this PayloadDialout.

        Globally unique identifier associated with this endpoint in this meeting. (Typically a string starting with \"connguid:\")  # noqa: E501

        :param connection_guid: The connection_guid of this PayloadDialout.  # noqa: E501
        :type: str
        """

        self._connection_guid = connection_guid

    @property
    def country_code(self):
        """Gets the country_code of this PayloadDialout.  # noqa: E501

        One or two digit number corresponding to the ITU identifier for the country being called  # noqa: E501

        :return: The country_code of this PayloadDialout.  # noqa: E501
        :rtype: int
        """
        return self._country_code

    @country_code.setter
    def country_code(self, country_code):
        """Sets the country_code of this PayloadDialout.

        One or two digit number corresponding to the ITU identifier for the country being called  # noqa: E501

        :param country_code: The country_code of this PayloadDialout.  # noqa: E501
        :type: int
        """

        self._country_code = country_code

    @property
    def paired_participant_guid(self):
        """Gets the paired_participant_guid of this PayloadDialout.  # noqa: E501

        Globally unique identifier associated with the media component of this endpoint for this meeting.  (Typically a string starting with \"seamguid:\")  # noqa: E501

        :return: The paired_participant_guid of this PayloadDialout.  # noqa: E501
        :rtype: str
        """
        return self._paired_participant_guid

    @paired_participant_guid.setter
    def paired_participant_guid(self, paired_participant_guid):
        """Sets the paired_participant_guid of this PayloadDialout.

        Globally unique identifier associated with the media component of this endpoint for this meeting.  (Typically a string starting with \"seamguid:\")  # noqa: E501

        :param paired_participant_guid: The paired_participant_guid of this PayloadDialout.  # noqa: E501
        :type: str
        """

        self._paired_participant_guid = paired_participant_guid

    @property
    def phone_number(self):
        """Gets the phone_number of this PayloadDialout.  # noqa: E501

        The invited user's phone number  # noqa: E501

        :return: The phone_number of this PayloadDialout.  # noqa: E501
        :rtype: str
        """
        return self._phone_number

    @phone_number.setter
    def phone_number(self, phone_number):
        """Sets the phone_number of this PayloadDialout.

        The invited user's phone number  # noqa: E501

        :param phone_number: The phone_number of this PayloadDialout.  # noqa: E501
        :type: str
        """

        self._phone_number = phone_number

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(PayloadDialout, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PayloadDialout):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
