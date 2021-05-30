
// $FF: renamed from: cc
public class class_164 {

    // $FF: renamed from: e nf[]
   public static class_376[] field_2041;
    // $FF: renamed from: kr ce
   static class_100 field_2044;


   // $FF: renamed from: d (long) int
   public static int method_3425(long var0) {
      try {
         return (int)(var0 >>> 17 & 4294967295L);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: x (int, cf, boolean, int) int
   static int method_3427(int var0, int var3) {
      try {
         class_37 var7;
         if(2700 == var0) {
            if(var3 <= -634330132) {
               throw new IllegalStateException();
            } else {
               var7 = class_71.method_1047(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885]);
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 539336237 * var7.field_229;
               return 1;
            }
         } else if(2701 == var0) {
            if(var3 <= -634330132) {
               throw new IllegalStateException();
            } else {
               var7 = class_71.method_1047(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885]);
               if(-1 != 539336237 * var7.field_229) {
                  if(var3 <= -634330132) {
                     throw new IllegalStateException();
                  }

                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var7.field_161 * 1575834679;
               } else {
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
               }

               return 1;
            }
         } else if(2702 == var0) {
            if(var3 <= -634330132) {
               throw new IllegalStateException();
            } else {
               int var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
               class_48 var5 = (class_48)client.field_1578.method_6523((long)var4);
               if(null != var5) {
                  if(var3 <= -634330132) {
                     throw new IllegalStateException();
                  }

                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1;
               } else {
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
               }

               return 1;
            }
         } else if(var0 == 2706) {
            if(var3 <= -634330132) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1412 * 1338880923;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}
