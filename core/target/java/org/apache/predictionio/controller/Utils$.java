package org.apache.predictionio.controller;
/** Controller utilities.
 * <p>
 * @group Helper
 */
public  class Utils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Utils$ MODULE$ = null;
  public   Utils$ ()  { throw new RuntimeException(); }
  /** Default JSON4S serializers for PredictionIO controllers. */
  public  org.json4s.Formats json4sDefaultFormats ()  { throw new RuntimeException(); }
  /** Save a model object as a file to a temporary location on local filesystem.
   * It will first try to use the location indicated by the environmental
   * variable PIO_FS_TMPDIR, then fall back to the java.io.tmpdir property.
   * <p>
   * @param id Used as the filename of the file.
   * @param model Model object.
   */
  public  void save (java.lang.String id, Object model)  { throw new RuntimeException(); }
  /** Load a model object from a file in a temporary location on local
   * filesystem. It will first try to use the location indicated by the
   * environmental variable PIO_FS_TMPDIR, then fall back to the java.io.tmpdir
   * property.
   * <p>
   * @param id Used as the filename of the file.
   * @return (undocumented)
   */
  public  Object load (java.lang.String id)  { throw new RuntimeException(); }
}
