package lifestyle.dt.global.security.exception

import lifestyle.dt.global.error.ErrorCode
import lifestyle.dt.global.error.exception.DTException

class InvalidTokenTypeException: DTException(ErrorCode.INVALID_TOKEN_TYPE)