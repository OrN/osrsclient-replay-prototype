import java.util.Comparator;

// $FF: renamed from: ln
public abstract class class_181 implements Comparator {

   // $FF: renamed from: n java.util.Comparator
   Comparator field_2242;


    // $FF: renamed from: <init> () void
   protected class_181() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: d (java.util.Comparator, int) void
   final void method_3823(Comparator var1, int var2) {
      try {
         if(null == this.field_2242) {
            if(var2 != -82971499) {
               return;
            }

            this.field_2242 = var1;
         } else if(this.field_2242 instanceof class_181) {
            ((class_181)this.field_2242).method_3823(var1, -82971499);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: s (lx, lx, byte) int
   protected final int method_3830(class_338 var1, class_338 var2) {
      try {
         return this.field_2242 == null?0:this.field_2242.compare(var1, var2);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }
}
