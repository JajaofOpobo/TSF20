precision mediump float;      
varying vec2 vTextureCoord;      
uniform sampler2D sTexture;      
varying vec4 vColor;      
void main() {      
 gl_FragColor = vColor*texture2D(sTexture, vTextureCoord).rgba;      
}