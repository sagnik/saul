/** This software is released under the University of Illinois/Research and Academic Use License. See
  * the LICENSE file in the root folder for details. Copyright (c) 2016
  *
  * Developed by: The Cognitive Computations Group, University of Illinois at Urbana-Champaign
  * http://cogcomp.cs.illinois.edu/
  */
package edu.illinois.cs.cogcomp.saulexamples.nlp.EmailSpam

import edu.illinois.cs.cogcomp.lbjava.learn.SupportVectorMachine
import edu.illinois.cs.cogcomp.saul.classifier.Learnable
import edu.illinois.cs.cogcomp.saul.learn.SaulWekaWrapper
import edu.illinois.cs.cogcomp.saulexamples.nlp.EmailSpam.SpamDataModel._
import weka.classifiers.bayes.NaiveBayes

object SpamClassifiers {
  object SpamClassifier extends Learnable(email) {
    def label = spamLabel
    override lazy val classifier = new SupportVectorMachine()
    override def feature = using(words, bigrams)
  }

  object SpamClassifierWithCache extends Learnable(email) {
    def label = spamLabel
    override lazy val classifier = new SupportVectorMachine()
    override def feature = using(words)
    override val useCache = true
  }

  object DeserializedSpamClassifier extends Learnable(email) {
    def label = spamLabel
    override lazy val classifier = new SupportVectorMachine()
    override def feature = using(words)
  }
  object SpamClassifierWeka extends Learnable(email) {
    def label = spamLabel
    override lazy val classifier = new SaulWekaWrapper(new NaiveBayes())
    override def feature = using(words)
  }
}
