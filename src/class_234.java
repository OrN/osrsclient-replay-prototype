
// $FF: renamed from: fr
public class class_234 {

    // $FF: renamed from: n fr
   static final class_234 field_2619;
   // $FF: renamed from: do ls
   static GameSocket clientSocket;
    // $FF: renamed from: v fr
   static final class_234 field_2622;
   // $FF: renamed from: f int
   final int field_2623;
   // $FF: renamed from: d int[]
   static int[] field_2624;
   // $FF: renamed from: be op
   static class_66 field_2625;


   // $FF: renamed from: v (jv, jv, jv, hp, int) boolean
   public static boolean method_4590(class_306 var0, class_306 var1, class_306 var2, class_106 var3) {
      try {
         class_270.field_3182 = var0;
         class_270.field_3184 = var1;
         class_75.field_606 = var2;
         class_198.field_2339 = var3;
         return true;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_234 var10000 = new class_234(0);
      field_2622 = var10000;
      var10000 = new class_234(1);
      field_2619 = var10000;
   }

   // $FF: renamed from: <init> (int) void
   class_234(int var1) {
      super();
      try {
         this.field_2623 = 122410317 * var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
