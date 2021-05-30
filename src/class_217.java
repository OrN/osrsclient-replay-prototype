
// $FF: renamed from: fd
public final class class_217 {

   // $FF: renamed from: r int
   static final int field_2474 = 30;
   // $FF: renamed from: n int[]
   final int[] field_2475;
   // $FF: renamed from: j int
   static final int field_2476 = 4;
   // $FF: renamed from: v int
   static final int field_2477 = 4096;
   // $FF: renamed from: o java.lang.String
   static final String field_2478 = ",";


   // $FF: renamed from: f (int, int) int
   final int method_4198(int var1, int var2) {
      return this.field_2475[var2 * 64 + var1];
   }

   // $FF: renamed from: <init> () void
   void method_4199() {
      try {
         super();
         this.field_2475 = new int[4096];
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "fd.<init>(" + ')');
      }
   }

   // $FF: renamed from: <init> (int[]) void
   void method_4200(int[] var1) {
      try {
         super();
         this.field_2475 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fd.<init>(" + ')');
      }
   }

   // $FF: renamed from: n (int, int, int) int
   final int method_4201(int var1, int var2, int var3) {
      try {
         return this.field_2475[var2 * 64 + var1];
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "fd.n(" + ')');
      }
   }

   // $FF: renamed from: v (int) void
   static void method_4202(int var0) {
      try {
         for(class_103 var1 = (class_103)class_103.field_1203.method_5944(); var1 != null; var1 = (class_103)class_103.field_1203.method_5972()) {
            if(var0 == 900433593) {
               throw new IllegalStateException();
            }

            if(var1.field_1196 != null) {
               if(var0 == 900433593) {
                  throw new IllegalStateException();
               }

               class_320.field_3804.method_2199(var1.field_1196);
               var1.field_1196 = null;
            }

            if(var1.field_1201 != null) {
               if(var0 == 900433593) {
                  throw new IllegalStateException();
               }

               class_320.field_3804.method_2199(var1.field_1201);
               var1.field_1201 = null;
            }
         }

         class_103.field_1203.method_5966();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fd.v(" + ')');
      }
   }
}
