package com.siacespark.structural.adapter.adapters;

import com.siacespark.structural.adapter.round.RoundPeg;
import com.siacespark.structural.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(Math.sqrt(2) / 2 * squarePeg.getWidth());
        this.squarePeg = squarePeg;
    }
}
