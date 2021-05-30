
// $FF: renamed from: bt
public class class_156 {

   // $FF: renamed from: b int
   int field_1941;
   // $FF: renamed from: n int[]
   int[] field_1942;
   // $FF: renamed from: f int[]
   int[] field_1943;
   // $FF: renamed from: p int
   int field_1944;
   // $FF: renamed from: u int
   int field_1945;
   // $FF: renamed from: r int
   int field_1946;
   // $FF: renamed from: v int
   int field_1947;
   // $FF: renamed from: d int
   int field_1948;
   // $FF: renamed from: j int
   int field_1949;
   // $FF: renamed from: y int
   int field_1950;
   // $FF: renamed from: s int
   int field_1951;


   // $FF: renamed from: b (nd) void
   final void method_3263(class_28 var1) {
      this.field_1947 = var1.method_130(1048869499);
      this.field_1942 = new int[this.field_1947];
      this.field_1943 = new int[this.field_1947];

      for(int var2 = 0; var2 < this.field_1947; ++var2) {
         this.field_1942[var2] = var1.method_132((byte)-80);
         this.field_1943[var2] = var1.method_132((byte)-90);
      }

   }

   // $FF: renamed from: v (nd) void
   final void method_3264(class_28 var1) {
      this.field_1946 = var1.method_130(400725309);
      this.field_1944 = var1.method_135((byte)-42);
      this.field_1949 = var1.method_135((byte)-83);
      this.method_3277(var1);
   }

   // $FF: renamed from: <init> () void
   class_156() {
      super();
      this.field_1947 = 2;
      this.field_1942 = new int[2];
      this.field_1943 = new int[2];
      this.field_1942[0] = 0;
      this.field_1942[1] = '\uffff';
      this.field_1943[0] = 0;
      this.field_1943[1] = '\uffff';
   }

   // $FF: renamed from: f () void
   final void method_3266() {
      this.field_1941 = 0;
      this.field_1948 = 0;
      this.field_1951 = 0;
      this.field_1945 = 0;
      this.field_1950 = 0;
   }

   // $FF: renamed from: y (int) int
   final int method_3267(int var1) {
      if(this.field_1950 >= this.field_1941) {
         this.field_1945 = this.field_1943[this.field_1948++] << 15;
         if(this.field_1948 >= this.field_1947) {
            this.field_1948 = this.field_1947 - 1;
         }

         this.field_1941 = (int)((double)this.field_1942[this.field_1948] / 65536.0D * (double)var1);
         if(this.field_1941 > this.field_1950) {
            this.field_1951 = ((this.field_1943[this.field_1948] << 15) - this.field_1945) / (this.field_1941 - this.field_1950);
         }
      }

      this.field_1945 += this.field_1951;
      ++this.field_1950;
      return this.field_1945 - this.field_1951 >> 15;
   }

   // $FF: renamed from: d (nd) void
   final void method_3268(class_28 var1) {
      this.field_1947 = var1.method_130(-1556345344);
      this.field_1942 = new int[this.field_1947];
      this.field_1943 = new int[this.field_1947];

      for(int var2 = 0; var2 < this.field_1947; ++var2) {
         this.field_1942[var2] = var1.method_132((byte)-43);
         this.field_1943[var2] = var1.method_132((byte)-59);
      }

   }

   // $FF: renamed from: j (nd) void
   final void method_3269(class_28 var1) {
      this.field_1946 = var1.method_130(-1157978509);
      this.field_1944 = var1.method_135((byte)-43);
      this.field_1949 = var1.method_135((byte)-94);
      this.method_3277(var1);
   }

   // $FF: renamed from: r (nd) void
   final void method_3270(class_28 var1) {
      this.field_1946 = var1.method_130(1367213334);
      this.field_1944 = var1.method_135((byte)-93);
      this.field_1949 = var1.method_135((byte)-87);
      this.method_3277(var1);
   }

   // $FF: renamed from: c () void
   final void method_3271() {
      this.field_1941 = 0;
      this.field_1948 = 0;
      this.field_1951 = 0;
      this.field_1945 = 0;
      this.field_1950 = 0;
   }

   // $FF: renamed from: u (nd) void
   final void method_3272(class_28 var1) {
      this.field_1947 = var1.method_130(1365140530);
      this.field_1942 = new int[this.field_1947];
      this.field_1943 = new int[this.field_1947];

      for(int var2 = 0; var2 < this.field_1947; ++var2) {
         this.field_1942[var2] = var1.method_132((byte)-109);
         this.field_1943[var2] = var1.method_132((byte)-121);
      }

   }

   // $FF: renamed from: s (nd) void
   final void method_3273(class_28 var1) {
      this.field_1947 = var1.method_130(264122862);
      this.field_1942 = new int[this.field_1947];
      this.field_1943 = new int[this.field_1947];

      for(int var2 = 0; var2 < this.field_1947; ++var2) {
         this.field_1942[var2] = var1.method_132((byte)-65);
         this.field_1943[var2] = var1.method_132((byte)-103);
      }

   }

   // $FF: renamed from: p (nd) void
   final void method_3274(class_28 var1) {
      this.field_1946 = var1.method_130(1387518778);
      this.field_1944 = var1.method_135((byte)-37);
      this.field_1949 = var1.method_135((byte)-2);
      this.method_3277(var1);
   }

   // $FF: renamed from: l () void
   final void method_3275() {
      this.field_1941 = 0;
      this.field_1948 = 0;
      this.field_1951 = 0;
      this.field_1945 = 0;
      this.field_1950 = 0;
   }

   // $FF: renamed from: o () void
   final void method_3276() {
      this.field_1941 = 0;
      this.field_1948 = 0;
      this.field_1951 = 0;
      this.field_1945 = 0;
      this.field_1950 = 0;
   }

   // $FF: renamed from: n (nd) void
   final void method_3277(class_28 var1) {
      this.field_1947 = var1.method_130(-1426987541);
      this.field_1942 = new int[this.field_1947];
      this.field_1943 = new int[this.field_1947];

      for(int var2 = 0; var2 < this.field_1947; ++var2) {
         this.field_1942[var2] = var1.method_132((byte)-44);
         this.field_1943[var2] = var1.method_132((byte)-116);
      }

   }

   // $FF: renamed from: e (int) int
   final int method_3278(int var1) {
      if(this.field_1950 >= this.field_1941) {
         this.field_1945 = this.field_1943[this.field_1948++] << 15;
         if(this.field_1948 >= this.field_1947) {
            this.field_1948 = this.field_1947 - 1;
         }

         this.field_1941 = (int)((double)this.field_1942[this.field_1948] / 65536.0D * (double)var1);
         if(this.field_1941 > this.field_1950) {
            this.field_1951 = ((this.field_1943[this.field_1948] << 15) - this.field_1945) / (this.field_1941 - this.field_1950);
         }
      }

      this.field_1945 += this.field_1951;
      ++this.field_1950;
      return this.field_1945 - this.field_1951 >> 15;
   }
}
