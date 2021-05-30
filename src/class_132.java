import java.util.concurrent.Callable;

// $FF: renamed from: al
public class class_132 implements Callable {

    // $FF: renamed from: d short[]
   public static short[] field_1725;
   // $FF: synthetic field
   final class_138 this$0;
    // $FF: renamed from: n ai
   final class_1 field_1727;
    // $FF: renamed from: v nd
   final class_28 field_1730;
   // $FF: renamed from: lt int
   static int field_1731;


    // $FF: renamed from: <init> (as, nd, ai) void
   class_132(class_138 var1, class_28 var2, class_1 var3) {
      super();
      try {
         this.this$0 = var1;
         this.field_1730 = var2;
         this.field_1727 = var3;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   public Object call() {
      try {
         return this.field_1727.method_3(this.field_1730);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }
}
