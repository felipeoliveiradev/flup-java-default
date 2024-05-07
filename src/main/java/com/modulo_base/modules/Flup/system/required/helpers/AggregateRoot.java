package com.modulo_base.modules.Flup.system.required.helpers;

public abstract class AggregateRoot<ID extends Identifier> extends Entity<ID> {

    public AggregateRoot(final ID id) {
        super(id);
    }
}
