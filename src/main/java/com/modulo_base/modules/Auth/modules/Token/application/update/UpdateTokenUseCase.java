package com.modulo_base.modules.Auth.modules.Token.application.update;

import com.modulo_base.modules.Flup.system.required.helpers.UseCase;
import com.modulo_base.modules.Flup.system.validation.handlers.Notification;
import io.vavr.control.Either;

public abstract class UpdateTokenUseCase extends UseCase<UpdateTokenCommand, Either<Notification, UpdateTokenOutput>> {

}
