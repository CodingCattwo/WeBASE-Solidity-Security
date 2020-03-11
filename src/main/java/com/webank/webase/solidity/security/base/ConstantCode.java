/*
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.webank.webase.solidity.security.base;

/**
 * ConstantCode.
 *
 */
public interface ConstantCode {
    // return success
    RetCode RET_SUCCEED = RetCode.mark(0, "success");

    RetCode FILE_IS_EMPTY = RetCode.mark(303009, "file cannot be empty");
    RetCode NOT_A_ZIP_FILE = RetCode.mark(303010, "it is not a zip file");

    // system error
    RetCode SYSTEM_ERROR = RetCode.mark(103001, "system error");
    RetCode PARAM_VAILD_FAIL = RetCode.mark(103002, "param valid fail");
}
