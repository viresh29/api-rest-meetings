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

from BlueJeansMeetingsRestApi.models.recording_session import RecordingSession  # noqa: F401,E501


class RecordingRecordingChapters(object):
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
        'chapter_id': 'str',
        'id': 'int',
        'start_time_offset': 'int',
        'end_time_offset': 'int',
        'chapter_name': 'str',
        'total_size': 'int',
        'composite_content_id': 'int',
        'composite_content_status': 'str',
        'parent_recording_id': 'int',
        'view_count': 'int',
        'recording_sessions': 'list[RecordingSession]'
    }

    attribute_map = {
        'chapter_id': 'chapterId',
        'id': 'id',
        'start_time_offset': 'startTimeOffset',
        'end_time_offset': 'endTimeOffset',
        'chapter_name': 'chapterName',
        'total_size': 'totalSize',
        'composite_content_id': 'compositeContentId',
        'composite_content_status': 'compositeContentStatus',
        'parent_recording_id': 'parentRecordingId',
        'view_count': 'viewCount',
        'recording_sessions': 'recordingSessions'
    }

    def __init__(self, chapter_id=None, id=None, start_time_offset=None, end_time_offset=None, chapter_name=None, total_size=None, composite_content_id=None, composite_content_status=None, parent_recording_id=None, view_count=None, recording_sessions=None):  # noqa: E501
        """RecordingRecordingChapters - a model defined in Swagger"""  # noqa: E501

        self._chapter_id = None
        self._id = None
        self._start_time_offset = None
        self._end_time_offset = None
        self._chapter_name = None
        self._total_size = None
        self._composite_content_id = None
        self._composite_content_status = None
        self._parent_recording_id = None
        self._view_count = None
        self._recording_sessions = None
        self.discriminator = None

        if chapter_id is not None:
            self.chapter_id = chapter_id
        if id is not None:
            self.id = id
        if start_time_offset is not None:
            self.start_time_offset = start_time_offset
        if end_time_offset is not None:
            self.end_time_offset = end_time_offset
        if chapter_name is not None:
            self.chapter_name = chapter_name
        if total_size is not None:
            self.total_size = total_size
        if composite_content_id is not None:
            self.composite_content_id = composite_content_id
        if composite_content_status is not None:
            self.composite_content_status = composite_content_status
        if parent_recording_id is not None:
            self.parent_recording_id = parent_recording_id
        if view_count is not None:
            self.view_count = view_count
        if recording_sessions is not None:
            self.recording_sessions = recording_sessions

    @property
    def chapter_id(self):
        """Gets the chapter_id of this RecordingRecordingChapters.  # noqa: E501


        :return: The chapter_id of this RecordingRecordingChapters.  # noqa: E501
        :rtype: str
        """
        return self._chapter_id

    @chapter_id.setter
    def chapter_id(self, chapter_id):
        """Sets the chapter_id of this RecordingRecordingChapters.


        :param chapter_id: The chapter_id of this RecordingRecordingChapters.  # noqa: E501
        :type: str
        """

        self._chapter_id = chapter_id

    @property
    def id(self):
        """Gets the id of this RecordingRecordingChapters.  # noqa: E501


        :return: The id of this RecordingRecordingChapters.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this RecordingRecordingChapters.


        :param id: The id of this RecordingRecordingChapters.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def start_time_offset(self):
        """Gets the start_time_offset of this RecordingRecordingChapters.  # noqa: E501


        :return: The start_time_offset of this RecordingRecordingChapters.  # noqa: E501
        :rtype: int
        """
        return self._start_time_offset

    @start_time_offset.setter
    def start_time_offset(self, start_time_offset):
        """Sets the start_time_offset of this RecordingRecordingChapters.


        :param start_time_offset: The start_time_offset of this RecordingRecordingChapters.  # noqa: E501
        :type: int
        """

        self._start_time_offset = start_time_offset

    @property
    def end_time_offset(self):
        """Gets the end_time_offset of this RecordingRecordingChapters.  # noqa: E501


        :return: The end_time_offset of this RecordingRecordingChapters.  # noqa: E501
        :rtype: int
        """
        return self._end_time_offset

    @end_time_offset.setter
    def end_time_offset(self, end_time_offset):
        """Sets the end_time_offset of this RecordingRecordingChapters.


        :param end_time_offset: The end_time_offset of this RecordingRecordingChapters.  # noqa: E501
        :type: int
        """

        self._end_time_offset = end_time_offset

    @property
    def chapter_name(self):
        """Gets the chapter_name of this RecordingRecordingChapters.  # noqa: E501


        :return: The chapter_name of this RecordingRecordingChapters.  # noqa: E501
        :rtype: str
        """
        return self._chapter_name

    @chapter_name.setter
    def chapter_name(self, chapter_name):
        """Sets the chapter_name of this RecordingRecordingChapters.


        :param chapter_name: The chapter_name of this RecordingRecordingChapters.  # noqa: E501
        :type: str
        """

        self._chapter_name = chapter_name

    @property
    def total_size(self):
        """Gets the total_size of this RecordingRecordingChapters.  # noqa: E501


        :return: The total_size of this RecordingRecordingChapters.  # noqa: E501
        :rtype: int
        """
        return self._total_size

    @total_size.setter
    def total_size(self, total_size):
        """Sets the total_size of this RecordingRecordingChapters.


        :param total_size: The total_size of this RecordingRecordingChapters.  # noqa: E501
        :type: int
        """

        self._total_size = total_size

    @property
    def composite_content_id(self):
        """Gets the composite_content_id of this RecordingRecordingChapters.  # noqa: E501


        :return: The composite_content_id of this RecordingRecordingChapters.  # noqa: E501
        :rtype: int
        """
        return self._composite_content_id

    @composite_content_id.setter
    def composite_content_id(self, composite_content_id):
        """Sets the composite_content_id of this RecordingRecordingChapters.


        :param composite_content_id: The composite_content_id of this RecordingRecordingChapters.  # noqa: E501
        :type: int
        """

        self._composite_content_id = composite_content_id

    @property
    def composite_content_status(self):
        """Gets the composite_content_status of this RecordingRecordingChapters.  # noqa: E501


        :return: The composite_content_status of this RecordingRecordingChapters.  # noqa: E501
        :rtype: str
        """
        return self._composite_content_status

    @composite_content_status.setter
    def composite_content_status(self, composite_content_status):
        """Sets the composite_content_status of this RecordingRecordingChapters.


        :param composite_content_status: The composite_content_status of this RecordingRecordingChapters.  # noqa: E501
        :type: str
        """

        self._composite_content_status = composite_content_status

    @property
    def parent_recording_id(self):
        """Gets the parent_recording_id of this RecordingRecordingChapters.  # noqa: E501


        :return: The parent_recording_id of this RecordingRecordingChapters.  # noqa: E501
        :rtype: int
        """
        return self._parent_recording_id

    @parent_recording_id.setter
    def parent_recording_id(self, parent_recording_id):
        """Sets the parent_recording_id of this RecordingRecordingChapters.


        :param parent_recording_id: The parent_recording_id of this RecordingRecordingChapters.  # noqa: E501
        :type: int
        """

        self._parent_recording_id = parent_recording_id

    @property
    def view_count(self):
        """Gets the view_count of this RecordingRecordingChapters.  # noqa: E501


        :return: The view_count of this RecordingRecordingChapters.  # noqa: E501
        :rtype: int
        """
        return self._view_count

    @view_count.setter
    def view_count(self, view_count):
        """Sets the view_count of this RecordingRecordingChapters.


        :param view_count: The view_count of this RecordingRecordingChapters.  # noqa: E501
        :type: int
        """

        self._view_count = view_count

    @property
    def recording_sessions(self):
        """Gets the recording_sessions of this RecordingRecordingChapters.  # noqa: E501


        :return: The recording_sessions of this RecordingRecordingChapters.  # noqa: E501
        :rtype: list[RecordingSession]
        """
        return self._recording_sessions

    @recording_sessions.setter
    def recording_sessions(self, recording_sessions):
        """Sets the recording_sessions of this RecordingRecordingChapters.


        :param recording_sessions: The recording_sessions of this RecordingRecordingChapters.  # noqa: E501
        :type: list[RecordingSession]
        """

        self._recording_sessions = recording_sessions

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
        if issubclass(RecordingRecordingChapters, dict):
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
        if not isinstance(other, RecordingRecordingChapters):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
