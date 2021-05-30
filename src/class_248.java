
// $FF: renamed from: go
public final class class_248 {

   // $FF: renamed from: f int
   int field_2746;
   // $FF: renamed from: n int
   int field_2747;
   // $FF: renamed from: j int
   int field_2748;
   // $FF: renamed from: y gl
   public class_91 field_2749;
   // $FF: renamed from: p long
   public long field_2750;
   // $FF: renamed from: o int
   static final int field_2751 = 100;
   // $FF: renamed from: aa java.lang.String
   static final String field_2752 = "oldschool";
   // $FF: renamed from: v int
   int field_2753;


   // $FF: renamed from: <init> () void
   class_248() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: ak (int, byte) void
   static void method_4717(int var0, byte var1) {
      try {
         if(var0 == -1) {
            if(var1 != 1) {
               ;
            }
         } else if(class_191.method_3957(var0, (byte)-56)) {
            class_37[] var2 = class_37.field_93[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               class_37 var4 = var2[var3];
               if(var4.field_188 != null) {
                  if(var1 == 1) {
                     throw new IllegalStateException();
                  }

                  class_45 var10000 = new class_45();
                  class_45 var5 = var10000;
                  var5.field_332 = var4;
                  var5.field_337 = var4.field_188;
                  class_149.method_3180(var5, 5000000, 0, 704254621);
               }
            }

         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: y (int) mi[]
   static class_365[] method_4718() {
      try {
         return new class_365[]{class_365.field_4084, class_365.field_4086, class_365.field_4085, class_365.field_4087};
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }
}
