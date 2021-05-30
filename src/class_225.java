
// $FF: renamed from: fk
public class class_225 {

   // $FF: renamed from: v int
   static final int field_2540 = 16711935;
   // $FF: renamed from: n int
   static final int field_2541 = 96;
   // $FF: renamed from: r int
   static final int field_2542 = 2;
   // $FF: renamed from: ae int
   static final int field_2543 = 3;
   // $FF: renamed from: z int
   static final int field_2544 = 22;


   // $FF: renamed from: y (int, int) int
   static int method_4287(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(-1 == var0) {
         if(var1 < 0) {
            var1 = 0;
         } else if(var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   // $FF: renamed from: n (int, int) int
   static int method_4288(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(-1 == var0) {
         if(var1 < 0) {
            var1 = 0;
         } else if(var1 > 127) {
            var1 = 1505444700;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / -1498384784;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 143379112) {
            var1 = 126;
         }

         return (var0 & 1114890532) + var1;
      }
   }

   // $FF: renamed from: f (int, int) int
   static int method_4289(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(-1 == var0) {
         if(var1 < 0) {
            var1 = 0;
         } else if(var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   // $FF: renamed from: <init> () void
   void method_4290() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "fk.<init>(" + ')');
      }
   }
}
