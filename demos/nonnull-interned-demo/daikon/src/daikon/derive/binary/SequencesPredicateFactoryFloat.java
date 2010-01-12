// ***** This file is automatically generated from SequencesPredicateFactory.java.jpp

package daikon.derive.binary;

import daikon.*;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Factory for SequencesPredicate derived variables.
 **/
public final class SequencesPredicateFactoryFloat extends BinaryDerivationFactory {

  /** Debug tracer. **/
  public static final Logger debug =
    Logger.getLogger("daikon.derive.binary.SequencesPredicateFactoryFloat");

  public BinaryDerivation[] instantiate(VarInfo var1, VarInfo var2) {
    boolean enabled = SequencesPredicateFloat.dkconfig_enabled;
    if (!enabled) return null;

    if (debug.isLoggable(Level.FINE)) {
      debug.fine ("Trying to instantiate " + var1.name() + " and "
                  + var2.name());
    }

    if (!(var1.rep_type.isArray()) ||
        !(var2.rep_type.isArray())) {
      return null;
    }

    if (!var1.aux.getFlag(VarInfoAux.HAS_ORDER) ||
        !var2.aux.getFlag(VarInfoAux.HAS_ORDER)) {
      // Order doesn't matter, then predication is meaningless
      return null;
    }

    if (SequencesPredicateFloat.dkconfig_boolOnly) {
      if (!(var2.file_rep_type == ProglangType.BOOLEAN_ARRAY)) {
        return null;
      }
    }

    if (var1.derived != null || var2.derived != null) {
      // From derived variables.  Don't derive.
      return null;
    }

    if (SequencesPredicateFloat.dkconfig_fieldOnly) {

      if (!var1.is_field() || !var2.is_field())
        return null;

      if (!var1.has_same_parent (var2))
        return null;
    } else {
      // There may be predications that aren't of the x.a and x.b type
    }

    // Now we finally can derive

    if (!var1.domainTypeIOA().equals(var2.domainTypeIOA())) {
      debug.fine ("Incorrect domains");
      return null;
    }

    if (debug.isLoggable(Level.FINE)) {
      debug.fine (var1.ppt + ": " + var1.name() + " and " +
                   var2.name() + " are worth deriving from");
    }

    return new BinaryDerivation[] {
      new SequencesPredicateFloat (var1, var2, 0, "false"),
      new SequencesPredicateFloat (var1, var2, 1, "true"),
      // new SequencesPredicate (var1, var2, 0, "nonNull", false),
    };

  }

}
