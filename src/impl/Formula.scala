package impl

sealed trait Formula {
  /**
   * Optionally returns the formula as a horn clause.
   * Returns `None` if the formula is not a horn clause.
   */
  def asHornClause: Option[HornClause] = ???
}

object Formula {

  case class Term(t: Term) extends Formula

  case class Negation(formula: Formula) extends Formula

  case class Conjunction(formulae: Set[Formula]) extends Formula

  case class Disjunction(formulae: Set[Formula]) extends Formula

  case class Implicatation(left: Formula, right: Formula) extends Formula
}