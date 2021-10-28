# PPKWU-zima-2021


ENDPOINT:<br>
/scanner (GET) <br><br>
PARAMS:<br>
string (String)<br><br>
NOTE: <br>
Endpoint accepts string and returns meta data about it in JSON format.<br><br>
EXAMPLE:<br>
INPUT:<br>

    "string" : Ala123!

OUTPUT:<br>

    {
    "stringMetadata":
        {
            "upperLetters" : 1
            "lowerLetters" : 2
            "numbers": 3
            "specialChars" : 1
            "otherChars" : 0
        }
    }