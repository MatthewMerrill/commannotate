package com.mattmerr.commannotate;

import com.google.auto.service.AutoService;
import com.google.auto.service.processor.AutoServiceProcessor;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.HashMap;
import java.util.Set;

@SupportedAnnotationTypes({
  "com.mattmerr.commanotate.Command",
})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class CommandProcessor extends AutoServiceProcessor {

  public static HashMap<String, Integer> commands = new HashMap<>();

  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    Set<? extends Element> commands = roundEnv.getElementsAnnotatedWith(Command.class);

    int i = 0;
    for (Element cmd : commands) {
      CommandProcessor.commands.put(cmd.getSimpleName().toString(), i++);
    }
    System.out.println("mattcmd" + CommandProcessor.commands.toString());

    return true;
  }


}
