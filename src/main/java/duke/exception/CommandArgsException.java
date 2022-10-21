package duke.exception;

import duke.constant.Constant;

public class CommandArgsException extends DukeException {

    public CommandArgsException(String message) {
        super(message);
        setCode(Constant.ResponseCode.ERROR_ILLEGAL_ARGUMENTS);
    }
}